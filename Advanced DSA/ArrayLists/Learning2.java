import java.util.ArrayList;

public class Learning2 {
    // print reverse list..
    public static void printReverse(ArrayList<Integer> list) {
        System.out.print("[");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("List now: " + list);
        System.out.print("Reversed list: ");
        printReverse(list);
    }
}
