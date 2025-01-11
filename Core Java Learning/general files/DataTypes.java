public class DataTypes{
    public static void main(String args[]) {
        //! there are total 8 primitive data types in java:
        
        //? 1. boolean - 1 bit value stores, values- true / false
        boolean isOopEnabled = true;
        if(isOopEnabled) System.out.println("java is an OOP enabled language.");
        else System.out.println("Java is not an OOP enabled language.");
        
        //? 2. byte - 1 byte value stores, -128 to 127 values
        byte val1 = -128;
        byte val2 = 127;
        System.out.println(val1 + val2);
        
        //? 3. short - 2 byte value stores, - around -32.7k to 32.7k...
        short val3 = 32700;
        System.out.println(val3);

        //? 4. int - 4 byte value stores, - you can store too big integer values here.
        int val4 = 78349423;
        System.out.println(val4);

        //? 5. long - 8 byte value stores, - you can store unbelievably large integer value here. it requires to add 'l' or 'L' with following its value.
        long val5 = 73473423743648234L;
        System.out.println(val5);

        //? 6. float - 4 byte value stores, - you can store a floating point value here, the decimal value can be expanded upto 6 to 7 digits. as 'long', float also needs to add 'f' or 'F' with following its value.
        float val6 = 3.1493452f;
        System.out.println(val6);

        //? 7. double - 8 byte value stores, - you can store a floating point value here in same manner as float, just a difference is you can add upto 15 decimals. you can also add 'd' or 'D' but is not required. it is optional to use that mark of double!
        double val7 = 3.14234245245423D;
        double val8 = 523.124231212324;
        System.out.println(val7);
        System.out.println(val8);

        //? 8. char - 2 byte value stores, - it can be used to store a character value and it is required that you encloses your character inside a single quote and each single quote have only one character!
        char val9 = 'A';
        System.out.println(val9);
        char modulo = '%';
        System.out.println(modulo);

        //* hey 🙋🏻‍♀️ this is the complete guidance to all the primitive datatypes in java and it includes all the required details for us to know.

        // ! FLAGs:
        // * long = l / L
        // * float = f / F
        // * double = d / D
    }
}