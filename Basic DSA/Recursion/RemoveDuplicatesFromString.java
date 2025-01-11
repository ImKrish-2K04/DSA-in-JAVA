public class RemoveDuplicatesFromString {
    // Recursively remove duplicates from the string
    public static void modifyString(String str, int ind, StringBuilder newStr, boolean[] map) {
        // Base case: If index reaches the end, print the result
        if (ind == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(ind); // Get current character

        if (map[currChar - 'a']) {
            modifyString(str, ind + 1, newStr, map); // Skip if already added
        } else {
            map[currChar - 'a'] = true; // Mark character as seen
            modifyString(str, ind + 1, newStr.append(currChar), map); // Add to result
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege"; // Input string

        if (str == null || str.isEmpty()) { // Validate input
            System.out.println("String is empty!");
            return;
        }

        boolean[] arr = new boolean[26]; // Track seen characters ('a' to 'z')
        StringBuilder newStr = new StringBuilder(); // Store unique characters

        modifyString(str, 0, newStr, arr); // Start recursion
    }
}
