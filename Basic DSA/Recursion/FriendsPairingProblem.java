public class FriendsPairingProblem {
    // calculating the total ways friends can pair up or remain single
    public static int calculatePairingWays(int n) {
        // Base cases: If only 1 or 2 friends, return the count as it is
        if (n == 1 || n == 2) {
            return n;
        }

        // Case 1: Friend remains single
        int singleWays = calculatePairingWays(n - 1);

        // Case 2: Friend pairs up with one of the (n-1) friends
        int pairWays = (n - 1) * calculatePairingWays(n - 2);

        // Total ways is the sum of both cases
        int totalWays = singleWays + pairWays;

        return totalWays;
    }

    public static void main(String[] args) {
        // Test the method with 5 friends and print the result
        System.out.println("Total ways of pairing are: " + calculatePairingWays(5));
    }
}
