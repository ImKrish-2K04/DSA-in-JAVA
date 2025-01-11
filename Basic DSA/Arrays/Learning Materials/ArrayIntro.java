import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        /*
         ! array is a non-primitive data type and is a data structure.
         ! array can accept multiple values of the same data type.
         ! array stores its values in contiguous memory location.
         ! like, if we want to store marks of 5 different subjects, it could be of integer type of 4-byte. in memory, the first value will occupied by 1000 address, 2nd will be by 1004, 3rd by 1008 and so on...
         ! we can find the length of array by using its property 'length' by using '.' operator with the array name.
         ! let's see how to create an array and some operations on it!..
          
         ? array can be created in many ways..
          
         ? 1) DataType arrayName[] = new DataType[size];
         * here '[]' can be used exact after of DataType and before of arrayName also...
          
         ? arrays are static in size. means, once we declare its size before execution, it can't be further extended during run-time...

         ? in array, you can add data, remove data and update data using array indices.

         ? in array, index starts from '0' and it can move upto array's length-1;

         ? because, suppose your array's length is 10 and you're starting adding the data from the 0th index, you have to add data upto 'length-1' time, is 10 times data entering.
         */

        Scanner sc = new Scanner(System.in);
        int marks1[] = new int[5];

        /*
         ? you can take input of array elements as follows:
         * marks1[0] = sc.nextInt();
         * marks1[1] = sc.nextInt();
         * marks1[2] = sc.nextInt();
         * marks1[3] = sc.nextInt();
         * marks1[4] = sc.nextInt();
        
         ? but you can take input using loops in easy manner without writing too much lines of code..
         */

        // ?  taking values from user...
        for (int i = 0; i < marks1.length; i++) {
            System.out.print("enter value at " + i + "th index: ");
            marks1[i] = sc.nextInt();
        }

        // ? printing array values...

        for(int i=0; i<marks1.length; i++) {
            System.out.println("the value at " + i + "th index: " + marks1[i]);
        }

        sc.close();
    }
}
