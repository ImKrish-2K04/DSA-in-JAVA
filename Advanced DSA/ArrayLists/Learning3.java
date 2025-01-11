import java.util.ArrayList;

public class Learning3 {
    public static int findMax(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            if (max < nums.get(i)) {
                max = nums.get(i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(9);
        nums.add(3);
        nums.add(6);

        System.out.println("The maximum value in the list is: " + findMax(nums));
    }
}
