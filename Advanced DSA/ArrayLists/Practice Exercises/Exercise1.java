import java.util.ArrayList;

// This program checks whether a given list is monotonic (either entirely increasing or decreasing).
public class Exercise1 {

    // Method to check if the list is monotonic
    public static void isMonotonicList(ArrayList<Integer> list) {
        boolean inc = true; // Flag to check for increasing order
        boolean dec = true; // Flag to check for decreasing order

        // Iterate through the list to compare adjacent elements
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                dec = false; // If a smaller element is followed by a larger one, it's not decreasing
            }
            if (list.get(i) > list.get(i + 1)) {
                inc = false; // If a larger element is followed by a smaller one, it's not increasing
            }
        }

        // Determine the monotonicity of the list based on flags
        if (inc) {
            System.out.println("List is a monotonic increasing..");
        } else if (dec) {
            System.out.println("List is a monotonic decreasing..");
        } else {
            System.out.println("Not a monotonic list!");
        }
    }

    public static void main(String[] args) {
        // Initialize three different lists for testing
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // Populate list1 with elements in increasing order
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);

        // Populate list2 with elements in decreasing order
        list2.add(6);
        list2.add(5);
        list2.add(4);
        list2.add(4);

        // Populate list3 with elements that are neither increasing nor decreasing
        list3.add(1);
        list3.add(3);
        list3.add(2);

        // Test and print the results for each list
        isMonotonicList(list1); // Expected: List is a monotonic increasing.
        isMonotonicList(list2); // Expected: List is a monotonic decreasing.
        isMonotonicList(list3); // Expected: Not a monotonic list!
    }
}
