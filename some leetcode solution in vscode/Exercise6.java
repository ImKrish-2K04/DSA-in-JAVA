import java.util.Arrays;

// leetcode problem : 34

public class Exercise6 {
    public static int[] searchRange(int nums[], int target) {
        int ans[] = { -1, -1 };

        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    public static int search(int nums[], int target, boolean isFirstOcc) {
        int ans = -1;
        int st = 0;
        int end = nums.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (target == nums[mid]) {
                ans = mid;
                if (isFirstOcc) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 7, 7, 8, 8, 10 };
        System.out.println(Arrays.toString(searchRange(nums, 7)));
    }
}
