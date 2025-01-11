import java.util.ArrayList;

public class Learning4 {
    public static void swapElements(ArrayList<Integer> nums, int ind1, int ind2) {
        int temp = nums.get(ind1);
        nums.set(ind1, nums.get(ind2));
        nums.set(ind2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(9);
        nums.add(3);
        nums.add(6);

        System.out.println("Before swapping: " + nums);

        swapElements(nums, 1, 3);

        System.out.println("After swapping: " + nums);
    }
}
