public class CharSearchInString {
    // ? provide a string and a character, check whether the character is presents in the given string or not!
    // ? if the character is present then return true else false..

    // ! NOTE: this is made to search with the view of case-insensitiveness

    public static boolean charSearch(String arg, char target) {
        if (arg.length() == 0) {
            return false;
        }

        target = Character.toLowerCase(target);

        for (char ch : arg.toLowerCase().toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String name = "Makwana Krishna";
        char target = 'S';
        if (charSearch(name, target)) {
            System.out.println(target + " exists in given string.");
        } else {
            System.out.println(target + " is not exists in given string.");
        }
    }
}
