import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        // ?array is a fixed sized data structure which stores the elements of the same type.
        // ? ArrayList is same as array but here the size of array is not fixed, means we can define initial capacity of array but at the end if we want to add some extra elements in array then we can add without any error or exception!
        // ? this is where the array and ArrayList becomes different! and ArrayList is a part of the "Java Collection Framework"
        // ? syntax: ArrayList<wrapper_class_name> listName = new ArrayList<optional>(initialCapacity);

        Scanner sc = new Scanner(System.in);
        int initialCapacity = 5;

        ArrayList<Integer> list1 = new ArrayList<>(initialCapacity);

        // list1.add(10);
        // list1.add(20);
        // list1.add(30);
        // list1.add(40);
        // list1.add(50);

        // add total 5 values to the arraylist which is its initial capacity...
        for (int i = 0; i < initialCapacity; i++) {
            System.out.print("enter value: ");
            list1.add(sc.nextInt());
        }

        // let's add two extra elements in arraylist...
        list1.add(6);
        list1.add(7);

        // ? printing using for-each..
        // for (int n : list1) {
        // System.out.print(n + " ");
        // }

        // ? printing using for loop till initial capacity..
        // for (int i = 0; i < initialCapacity; i++) {
        // System.out.print(list1.get(i) + " ");
        // }

        // ? printing using for loop till its total range of values..
        // for (int i = 0; i < list1.size(); i++) {
        // System.out.print(list1.get(i) + " ");
        // }
        sc.close();
    }
}
