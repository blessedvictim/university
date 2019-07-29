import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SyncFailedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class QuickSort {

    public static int[] rand(int len) {
        return new Random(System.currentTimeMillis()).ints(len).toArray();
    }

    public static void printArr(int[] arr) {
        for (var n : arr)
            System.out.println(n);
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 1)
            return;

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int opora = array[low + (high - low) / 2];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void selectionSort (int[] numbers){
        int min, temp;

        for (int index = 0; index < numbers.length-1; index++){
            min = index;
            for (int scan = index+1; scan < numbers.length; scan++){
                if (numbers[scan] < numbers[min])
                    min = scan;
            }

            // Swap the values
            temp = numbers[min];
            numbers[min] = numbers[index];
            numbers[index] = temp;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = rand(10);
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
