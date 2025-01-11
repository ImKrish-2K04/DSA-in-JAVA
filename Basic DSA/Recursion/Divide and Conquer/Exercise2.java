public class Exercise2 {
    static int arr[] = { 2, 2, 1, 1, 1, 2, 2 };

    // both the following methods are doing the same work..
    // but the approach of both are little bit different..
    // these both are created for conceptual clearity....

    // findMajority1 method returning the majority element found in the array..
    public static int findMajority1(int majority, int lead, int ind) {
        if (ind == arr.length) {
            return majority;
        }

        if (arr[ind] == majority) {
            lead++;
        } else if (lead > 0) {
            lead--;
        } else {
            majority = arr[ind];
            lead = 1;
        }

        return findMajority1(majority, lead, ind + 1);
    }

    // findMajority2 method prints the majority element with its lead in the array..
    public static void findMajority2(int majority, int lead, int ind) {
        if (ind == arr.length) {
            System.out.println(majority + " is leading by " + lead);
            return;
        }

        if (arr[ind] == majority) {
            lead++;
        } else if (lead > 0) {
            lead--;
        } else {
            majority = arr[ind];
            lead = 1;
        }

        findMajority2(majority, lead, ind + 1);
    }

    public static void main(String[] args) {
        // using returning method:
        int majorityElement = findMajority1(arr[0], 1, 1);
        System.out.println("majority element is: " + majorityElement);

        // using non-returning method:
        findMajority2(arr[0], 1, 1);
    }
}