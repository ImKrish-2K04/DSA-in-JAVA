public class LiteralsDemo {
    public static void main(String[] args) {
        // **Literals in Java**
        // Literals are fixed constant values assigned to variables directly in the code.
        // They represent the fundamental building blocks of Java programs.
        // Types of literals in Java:

        // 1. **Integer Literals**
        // Represent whole numbers without a fractional component.
        int decimal = 25; // Decimal (Base 10) literal
        int octal = 031; // Octal (Base 8, starts with 0)
        int hex = 0x19; // Hexadecimal (Base 16, starts with 0x)
        int binary = 0b11001; // Binary (Base 2, starts with 0b)
        System.out.println("Integer Literals: " + decimal + ", " + octal + ", " + hex + ", " + binary);

        // 2. **Floating-point Literals**
        // Represent real numbers with decimal points or in exponential notation.
        float pi = 3.14f; // 'f' denotes a float literal
        double gravity = 9.8; // Default is double
        double exp = 1.2e3; // Exponential notation (1.2 x 10^3)
        System.out.println("Floating-point Literals: " + pi + ", " + gravity + ", " + exp);

        // 3. **Character Literals**
        // Represent single characters enclosed in single quotes.
        char letter = 'A'; // Single character
        char newline = '\n'; // Escape sequence for newline
        char unicode = '\u0041'; // Unicode for 'A'
        System.out.println("Character Literals: " + letter + " (Unicode: " + unicode + ")" + newline + "Newline Example");

        // 4. **String Literals**
        // Represent sequences of characters enclosed in double quotes.
        String message = "Hello, Java!"; // String literal
        String multiline = "Line 1\nLine 2"; // Includes a newline character
        System.out.println("String Literals: " + message);
        System.out.println(multiline);

        // 5. **Boolean Literals**
        // Represent logical values `true` or `false`.
        boolean isFun = true;
        boolean isClosed = false;
        System.out.println("Boolean Literals: " + isFun + ", " + isClosed);

        // 6. **Null Literal**
        // Represents the absence of a value or null reference for objects.
        String text = null; // Null reference
        System.out.println("Null Literal: " + text);

        // Additional Notes on Literals:
        // a. **Underscores in Numeric Literals**:
        // Underscores can improve readability in large numbers.
        int largeNumber = 1_000_000; // Underscore as a separator
        System.out.println("Underscores in Numeric Literals: " + largeNumber);

        // b. **Default Data Types for Literals**:
        // - Integer literals are `int` by default. Use `L` or `l` for `long`.
        // - Floating-point literals are `double` by default. Use `F` or `f` for `float`.
        long largeInt = 10000000000L; // Long literal
        float smallValue = 5.5f; // Float literal
        System.out.println("Default Data Type Examples: long = " + largeInt + ", float = " + smallValue);

        // c. **Escape Sequences in Character and String Literals**:
        // - `\n`: Newline
        // - `\t`: Tab
        // - `\\`: Backslash
        // - `\'`: Single quote
        // - `\"`: Double quote
        String escapeExample = "This is a tab:\tAnd this is a newline:\nEnd";
        System.out.println("Escape Sequences Example:\n" + escapeExample);
    }
}
