public class MajorityElementFounder {
    public static void majorityElement(int arr[]) {
        int majority = arr[0], lead = 1;

        for (int i = 1; i < arr.length; i++) {
            // System.out.println("majority : " + majority);
            // System.out.println("lead : " + lead);
            if (majority == arr[i]) {
                lead++;
            } else if (lead > 0) {
                lead--;
            } else {
                majority = arr[i];
                lead = 1;
            }
        }

        // System.out.println("-------------------------------------");
        System.out.println("The majority element is: " + majority);
        System.out.println("its lead is: " + lead);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 40, 20, 40, 50, 20, 20, 20 };
        majorityElement(arr);
    }
}
