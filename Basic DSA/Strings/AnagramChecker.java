import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        // ? two strings are called an anagram if the number of characters and the frequency of each characters is same in both string! order is not a thing which matters here...
        
        String s1 = "listen", s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println("strings are not anagram!");
        } else {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("strings are anagram");
            } else {
                System.out.println("strings are not anagram");
            }
        }
    }
}
