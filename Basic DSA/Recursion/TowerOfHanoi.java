public class TowerOfHanoi {

    // Recursive function to solve the Tower of Hanoi problem
    // disc: Number of discs to be moved
    // source: The peg from which discs are to be moved
    // destination: The peg to which discs should be moved
    // helper: The auxiliary peg used to assist in the movement
    public static void towerOfHanoi(int disc, String source, String destination, String helper) {

        // Base case: If there are no discs to move, simply return
        if (disc == 0) {
            return;
        }

        // Step 1:
        // Move n-1 discs from source to helper using destination as an auxiliary peg
        // This is a recursive call to move the smaller discs
        towerOfHanoi(disc - 1, source, helper, destination);

        // Step 2: Move the largest disc (disc) from source to destination
        // This is the actual move for the current disc
        System.out.println("Disk " + disc + " moved from " + source + " to " + destination);

        // Step 3:
        // Move n-1 discs from helper to destination using source as an auxiliary peg
        // re-call to move the remaining discs after the largest one has been placed
        towerOfHanoi(disc - 1, helper, destination, source);
    }

    // Main function to initiate the Tower of Hanoi solution
    public static void main(String[] args) {
        // Calling the recursive function to solve for 4 discs
        // with A as source, C as destination, and B as helper
        towerOfHanoi(4, "A", "C", "B");
    }
}
