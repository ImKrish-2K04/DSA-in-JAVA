public class TypeConversion {
    public static void main(String[] args) {
        /*
        ! there are 2 types of Type Conversion in JAVA.
        ? 1) Implicit Conversion / direct conversion / widening
        ? 2) Explicit Conversion / indirect conversion / narrowing

        ? 1> Implicit Conversion:
        * Implicit conversion, also known as automatic type conversion, occurs when the Java compiler automatically converts one data type to another. This typically happens when converting a smaller data type to a larger one.
        * For example, if you have a variable of a smaller type like `short` and assign it to a larger type like `int`, the conversion happens automatically:
          short n1 = 23423;
          int n2 = n1; // n1 is implicitly converted to int
        * In this example, `n1` is implicitly converted to `int` when assigned to `n2`. However, the reverse is not true; you cannot directly assign an `int` to a `short` without explicit casting, as it may lead to data loss.
        * It's generally advisable to declare variables with the appropriate type from the start, rather than relying on implicit conversion, to ensure clarity and prevent unintended data loss.

        ? 2> Explicit conversion:
        * Explicit conversion, also known as type casting, is the process of converting one data type to another by explicitly specifying the target data type. This is necessary when you want to convert a larger data type to a smaller one, which could potentially lead to data loss.
        * In explicit conversion, you must define the target data type to which you want to convert the value. This is done using casting syntax.
        * For example, converting a double to an int requires explicit casting because it involves truncating the decimal part, which can result in data loss:
          double doubleValue = 9.78;
          int intValue = (int) doubleValue; // This will truncate the decimal part
        * In this example, doubleValue is explicitly cast to intValue, resulting in the loss of the fractional part. This demonstrates the need for explicit conversion when dealing with potential data loss scenarios.
        */

        //! implicit conversion:
        short num = 12322;
        int num2 = num;
        System.out.println(num2);

        //! explicit conversion:
        double dbValue = 3.143235;
        int intValue = (int) dbValue;
        System.out.println(intValue);

        char ch = 'E';
        int asciiValue = (int) ch;
        System.out.println(asciiValue);
    }
}
