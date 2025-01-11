public class Learning2_1 {
    public static void stringSubset(String str, String ans, int i) {
        // base-case:
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // pushing the character...
        stringSubset(str, ans + str.charAt(i), i + 1);

        // not pushing the character...
        stringSubset(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        stringSubset(str, "", 0);
    }
}