import java.util.*;
// multidimensional ArrayList...
public class Learning6 {
    public static void printList(ArrayList<ArrayList<Integer>> list) {
        System.out.print("[\n");
        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> temp = list.get(i);
            System.out.print("\t[");
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(temp.get(j));
                if (j != temp.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("],");
            System.out.println();
        }
        System.out.println("]");

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            l1.add(i * 1);
            l2.add(i * 2);
            l3.add(i * 3);
        }

        list.add(l1);
        list.add(l2);
        list.add(l3);

        printList(list);
    }
}
