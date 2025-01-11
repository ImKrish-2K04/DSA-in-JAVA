public class PrintSubArrays {
    public static void subArrays(int arr[]) {
        // [ 2 , 4 , 6 , 8 , 10 ]

        for (int i = 0; i < arr.length; i++) {

            // ? starts indexing to the first element of each sub-arrays...

            for (int j = i; j < arr.length; j++) {

                // ? keeps track of the range of the sub-array to be printed...
                // ? suppose i=0, if j=0 then range is 1, j=1 then range is 2, and so on...

                System.out.print("[ ");

                for (int k = i; k <= j; k++) {

                    // ? prints the range of the sub-array from i'th index to the j'th index...
                    // ? like, if i=0 and j=3 it will runs 4 times and prints all elements comes in range from i'th index till j'th index...

                    if (k == j) {
                        System.out.print(arr[k] + " ]");
                    } else {
                        System.out.print(arr[k] + " , ");
                    }
                }

                System.out.println();
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subArrays(arr);
    }
}