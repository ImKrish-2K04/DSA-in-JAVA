public class Learning2_2 {
    // our method..

    public static void stringSubset(String str, StringBuilder sb, int i) {
        // base-case handling:
        if (i == str.length()) {
            System.out.println(sb.length() == 0 ? "{}" : ("{" + sb + "}"));
            return;
        }

        // including the current char in sub-set...
        stringSubset(str, sb.append(str.charAt(i)), i + 1);

        // removing the last character from 'sb'...
        sb = sb.deleteCharAt(sb.length() - 1);

        // not including the current char in sub-set...
        stringSubset(str, sb, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        stringSubset(str, new StringBuilder(), 0);
    }
}
