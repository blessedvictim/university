import java.util.*;

public class DataStrcuts {
    static class Node {
        Comparable elem;
        Node left, right;

        public Node(Comparable t) {
            elem = t;
        }

        public Comparable getValue() {
            return this.elem;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

    }

    static class Tree {
        Node root;

        public Tree(Node rootNode) {
            root = rootNode;
        }

        public void addNode(Node node) throws Exception {
            Node n = searchNode(root, node);
            if (node.getValue().compareTo(n.getValue()) < 0) {
                n.left = node;
            } else {
                n.right = node;
            }
        }

        Node searchNode(Node startNode, Node node) throws Exception {
            Node f = null;
            if (node.getValue().compareTo(startNode.getValue()) < 0) {
                f = startNode.left;
            }
            if (node.getValue().compareTo(startNode.getValue()) > 0) {
                f = startNode.right;
            }
            if (node.getValue().compareTo(startNode.getValue()) == 0) {
                throw new Exception("Node already exist");
            }
            if (f != null) {
                return searchNode(f, node);
            } else {
                return startNode;
            }

        }
    }


    public static void main(String[] args) {
//        Tree tree = new Tree(new Node(5));
//        try {
//            tree.addNode(new Node(8));
//            tree.addNode(new Node(10));
//            tree.addNode(new Node(1));
//            tree.addNode(new Node(4));
//            tree.addNode(new Node(0));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println("LOL");
        Map<String,String> map = new HashMap<>();
        map.put("lol","LOL");
        var lol = 5;
    }
}
