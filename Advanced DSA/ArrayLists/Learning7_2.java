import java.util.ArrayList;

// This program calculates the maximum water quantity a container can hold using the two-pointer approach.
public class Learning7_2 {

    // Finds the maximum quantity of water a container can store
    public static int findMaxWater(ArrayList<Integer> height) {
        int maxQuantity = 0; // Stores the maximum water quantity found so far

        int leftPointer = 0; // Pointer starting from the left end
        int rightPointer = height.size() - 1; // Pointer starting from the right end
        int lBar = -1, rBar = -1; // Indices of the optimal container's boundaries

        // Continue until the two pointers meet
        while (leftPointer < rightPointer) {
            // Determine the limiting height and calculate the width of the container
            int waterLvl = Math.min(height.get(leftPointer), height.get(rightPointer));
            int containerWidth = rightPointer - leftPointer;
            int waterQuantity = waterLvl * containerWidth; // Calculate water quantity for the current container

            // Update maximum quantity and boundaries if a larger area is found
            if (maxQuantity < waterQuantity) {
                maxQuantity = waterQuantity;
                lBar = leftPointer;
                rBar = rightPointer;
            }

            // Move the pointer associated with the shorter height
            if (height.get(leftPointer) < height.get(rightPointer)) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        // Print the indices of the optimal container for reference
        System.out.println("The area of container is from index: " + lBar + " to " + rBar);

        return maxQuantity;
    }

    public static void main(String[] args) {
        // Initialize the height list with predefined values
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // Display the maximum water quantity calculated
        System.out.println("Maximum water quantity allowed for this container is: " + findMaxWater(height));
    }
}
