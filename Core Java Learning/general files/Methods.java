import java.util.*;

/*
! the following code is the complete code for basic understanding of java methods or you can say functions in basic terminology! you can uncomment this entire block of commented-code... but please do comment the other blocks of code under main class i.e Methods


public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating scanner object for taking an input
        Methods mthds = new Methods(); // creating a Methods class object for calling those methods are not static and not able to call using className.

        mthds.greet();
        int height, width;

        System.out.print("enter height: ");
        height = sc.nextInt();
        System.out.print("enter width: ");
        width = sc.nextInt();

        int res = mthds.areaOfRectangle(height, width); // accepting the returning value i.e area from the areaOfRectangle() non-static method.

        System.out.println("the area of rectangle is: " + res);
        Methods.furtherTalks();
        sc.close();
    }

    public void greet() {
        System.out.println("Hey buddy, nice to meet ya!");
        ? a normal and simple method for just greetings. its a simple illustration of the creation of method in JAVA.
    }

    public int areaOfRectangle(int height, int width) {
        System.out.println("we're calculating the area of rectangle...");
        int area = height * width;
        return area;
        ? this is a area calculating method created with return type of int due to its returning nature of the final value i.e area of rectangle. it accepts 2 parameters of int type which are local to this method.
    }

    public static void furtherTalks() {
        System.out.println("if you need anything else, please connect to me without any hesitation!");
        ? static methods, are callable by the className. as we have seen, we are calling this method with the className Methods. this method is not returning anything hence it has a void return typed and it's a public method, so it can be accessible by object!
    }
}
*/

class RefClass {
    public int myVar1, myVar2;

    public void setter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value 1: ");
        myVar1 = sc.nextInt();
        System.out.print("enter value 2: ");
        myVar2 = sc.nextInt();
        sc.close();
    }

    public void getter() {
        System.out.println("value 1: " + myVar1);
        System.out.println("value 2: " + myVar2);
    }
}

public class Methods {
    public static void main(String[] args) {
        // int num1 = 21, num2 = 44;

        /*
         * ! pass by value:
         * 
         * The following function operates on the 'pass by value' concept.
         * 
         * The meaning of pass by value is creating a copy of variable value in memory
         * with distinct address, so you can use it for the method without making any
         * changes to the actual one.
         * 
         * Here, copies of the num1 and num2 variables are passed to the function and
         * assigned to the function parameters as arguments.
         * 
         * As a result, there are no changes to the actual variables after the function
         * call because the formal parameters are just copies and do not point to the
         * actual memory addresses of the original variables.
         * 
         * In Java, variables act as identifiers for heap memory addresses where the
         * actual values are stored, and these values are considered objects.
         * 
         * When a variable pointing to an actual value is passed to a function, the
         * compiler creates a copy of it and assigns it to the function's parameters.
         * 
         * Therefore, any changes made inside the function do not affect the actual
         * values or the variables pointing to those values.
         */

        // System.out.println("Actual before: " + num1 + ", " + num2);
        // Methods.swapNumbersByValue(num1, num2);
        // System.out.println("Actual after: " + num1 + ", " + num2);

        /*
         * ! pass by reference:
         * 
         * In Java, you cannot achieve pass by reference with primitive types. Java
         * always uses pass by value, which means that when you pass a primitive type to
         * a method, a copy of the value is made. Therefore, any changes made to the
         * parameter inside the method do not affect the original variable.
         * 
         * To achieve behavior similar to pass by reference, you need to use
         * non-primitive types, such as objects or arrays. When you pass an object or an
         * array to a method, you are passing a reference to that object or array. This
         * allows the method to modify the original object or array, as demonstrated in
         * your code with the RefClass object.
         * 
         * ? let's understand the flow of the program to understand the entire pass by
         * reference:
         * 
         * In Java, objects are passed by reference, meaning that when you pass an
         * object to a method, you are passing the reference to that object, not a copy
         * of the object itself. This allows the method to modify the original object.
         * 
         * ? Code Explanation
         * 
         * 1. Class Definition:
         * - 'RefClass' is defined with two integer variables, 'myVar1' and 'myVar2'.
         * - It includes methods 'setter()' to set these variables and 'getter()' to
         * print them.
         * 
         * 2. Main Method:
         * - An instance of 'RefClass' named 'obj1' is created.
         * - The 'setter()' method is called on 'obj1', prompting the user to input
         * values for 'myVar1' and 'myVar2'.
         * - The 'getter()' method is called to display the values before swapping.
         * 
         * 3. Swapping by Reference:
         * - The method 'swapByReference(RefClass myObj)' is called with 'obj1' as the
         * argument.
         * - Inside 'swapByReference', the values of 'myVar1' and 'myVar2' are swapped
         * using a temporary variable 'temp'.
         * - Since 'myObj' is a reference to 'obj1', the swap affects the original
         * 'obj1' object.
         * 
         * 4. Output After Swapping:
         * - After the swap, 'getter()' is called again to display the swapped values of
         * 'myVar1' and 'myVar2'.
         */

        RefClass obj1 = new RefClass();
        obj1.setter();
        System.out.println("before passing values:");
        obj1.getter();
        Methods.swapByReference(obj1);
        System.out.println("after passing values:");
        obj1.getter();
    }

    // public static void swapNumbersByValue(int n1, int n2) {
    // System.out.println("Formal before: " + n1 + ", " + n2);
    // int temp = n1;
    // n1 = n2;
    // n2 = temp;
    // System.out.println("Formal after: " + n1 + ", " + n2);
    // }

    public static void swapByReference(RefClass myObj) {
        int temp = myObj.myVar1;
        myObj.myVar1 = myObj.myVar2;
        myObj.myVar2 = temp;
    }
}