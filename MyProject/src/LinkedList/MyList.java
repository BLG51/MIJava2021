package LinkedList;

public class MyList {
    Node root;
    int size;

    public MyList() {
        root = new Node();
    }

    public void add(int a) {
        Node node = root;
        while (node.link != null) {
            node = node.link;
        }
        node.item = a;
        node.link = new Node();
        size++;
    }


    public void addAll(int[] array) {

    }

    public void delete(int a) {
        if (a > size) {
            throw new IndexOutOfBoundsException();
        }
        if (a == 0) {
            root = root.link;
            if (root == null) {
                root = new Node();
            }
        }
        int k = 0;
        Node node = root;
        while (k < a - 1) {
            node = node.link;
            k++;
        }
        node = node.link.link;
        size--;
    }

    public int get(int a) {
        if (a > size) {
            throw new IndexOutOfBoundsException();
        }
        int k = 0;
        Node node = root;
        while (k < a) {
            node = node.link;
            k++;
        }
        return node.item;
    }

//    public void test(){
////        Node node1 = node;
////        node.item = 1;
////        node1.item = 2;
////        System.out.println(node.item);   //2
//
//        Node node = new Node();
//        node.link= new Node();
//        node.link.link=new Node();
//        node = node.link.link;
//
//    }


}

class Node {
    int item;
    Node link;
}


