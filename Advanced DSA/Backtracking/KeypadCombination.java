import java.util.ArrayList;

public class KeypadCombination {
    public static void solve(ArrayList<String> str, String ans, int index) {
        // Base case: If the length of the answer is the same as the number of digits
        if (index == str.size()) {
            System.out.println(ans);
            return;
        }

        // Get the current string (e.g., "abc" for '2')
        String currentStr = str.get(index);

        // Loop through each character in the current string
        for (int i = 0; i < currentStr.length(); i++) {
            solve(str, ans + currentStr.charAt(i), index + 1);
        }
    }

    public static void combinator(String nums) {
        if (nums.length() == 0) {
            System.out.println("\"\"");
            return;
        }

        ArrayList<String> str = new ArrayList<>();

        // Map digits to corresponding characters
        for (int i = 0; i < nums.length(); i++) {
            char curr = nums.charAt(i);

            switch (curr) {
                case '2':
                    str.add("abc");
                    break;
                case '3':
                    str.add("def");
                    break;
                case '4':
                    str.add("ghi");
                    break;
                case '5':
                    str.add("jkl");
                    break;
                case '6':
                    str.add("mno");
                    break;
                case '7':
                    str.add("pqrs");
                    break;
                case '8':
                    str.add("tuv");
                    break;
                case '9':
                    str.add("wxyz");
                    break;
                default:
                    break;
            }
        }

        // Start the recursive process
        solve(str, "", 0);
    }

    public static void main(String[] args) {
        String nums = "12";
        combinator(nums);
    }
}
