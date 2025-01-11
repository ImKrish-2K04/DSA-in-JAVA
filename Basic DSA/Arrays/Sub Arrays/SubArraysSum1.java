public class SubArraysSum1 {
    public static void subArraySum(int arr[]) {
        // ? in reality, it's not a sum of sub-arrays but the sum of the elements of sub-arrays...
        
        // ? ex. [2 , 4 , 6 , 8 , 10]

        for (int i = 0; i < arr.length; i++) {

            System.out.println("sum of all sub-array elements where first element is " + arr[i]);

            for (int j = i; j < arr.length; j++) {
                int sum = 0; // * will resets after each sub-array's sum will be printed...

                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                System.out.print(sum + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subArraySum(arr);
    }
}
