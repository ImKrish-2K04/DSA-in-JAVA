public class StringWordCaseChanger {
    public static void main(String[] args) {
        // convert the first letter to uppercase for each word of a string..
        // maybe a lil bit easier than ma'am 's...

        StringBuilder str = new StringBuilder("i am a big data analyst.");

        int len = str.length();
        char ch;

        for (int i = 0; i < len - 1; i++) {
            if (i == 0) {
                ch = str.charAt(i);
                str.setCharAt(i, Character.toUpperCase(ch));
            } else {
                ch = str.charAt(i + 1);
                if (str.charAt(i) == ' ') {
                    str.setCharAt(i + 1, Character.toUpperCase(ch));
                }
            }
        }

        System.out.println(str);
    }
}
