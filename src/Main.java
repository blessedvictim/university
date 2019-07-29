import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        File file = new File("text.txt");

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            FileInputStream stream = new FileInputStream(file);
            List<String> strs = reader.lines().filter((line) -> {
                char arr[] = line.split(" ")[1].toCharArray();
                List<Character> list = new ArrayList<>();
                boolean valid = true;
                for (int i = 0; i < arr.length && valid; i++) {
                    if (list.contains(arr[i])) {
                        continue;
                    } else {
                        list.add(arr[i]);
                        if (list.size() > 3) {
                            valid = false;
                        }
                    }
                }
                return valid;
            }).collect(Collectors.toList());
            strs.forEach((str) -> {
                System.out.println(str);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
