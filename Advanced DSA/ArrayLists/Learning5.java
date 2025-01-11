// Sorting the list using an inbuilt sorting method...
// The inbuilt sorting method is part of the 'Collections' class...
// Note that there is also an interface named 'Collection' (with a slight difference of 's')...
// The 'Collections.sort()' method helps sort the list in ascending order by default...
// To sort in descending order, we need to pass a Comparator function...
// Comparator functions define custom logic that alters the sorting behavior...
// This logic allows us to change the default sorting order or apply custom sorting rules...

import java.util.ArrayList;
import java.util.Collections;

public class Learning5 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(2);
        nums.add(5);
        nums.add(9);
        nums.add(3);
        nums.add(6);

        System.out.println("Before sorting: " + nums);

        Collections.sort(nums);

        System.out.println("After sorting in ascending order: " + nums);

        Collections.sort(nums, Collections.reverseOrder());

        System.out.println("After sorting in descending order: " + nums);

    }
}
