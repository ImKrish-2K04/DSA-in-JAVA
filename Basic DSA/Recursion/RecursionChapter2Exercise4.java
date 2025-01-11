public class RecursionChapter2Exercise4 {

    // find all substrings starting and ending with the same character
    // use recursion...
    public static void myCall(String str, int i) {
        // Base case: If we reach the end of the string, return
        if (i == str.length()) {
            return;
        }

        // Iterate from the current start index (i) to the end of the string
        for (int j = i; j < str.length(); j++) {
            // Check if the first and last character of the substring are the same
            if (str.charAt(i) == str.charAt(j)) {
                // Print the valid substring (i to j)
                System.out.println(str.substring(i, j + 1));
            }
        }

        // Recursive call for the next starting index
        myCall(str, i + 1);
    }

    public static void main(String[] args) {
        // first test case
        System.out.println("first run:");
        myCall("abcab", 0); // Call the method with your test string

        // second test case
        System.out.println("\nsecond run:");
        myCall("asmasr", 0); // Call the method with your test string
    }
}
