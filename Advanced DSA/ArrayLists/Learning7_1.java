import java.util.ArrayList;

// This program calculates the maximum water quantity a container can hold
// based on the heights of vertical lines at various indices.

public class Learning7_1 {

    // Finds the maximum quantity of water a container can store
    public static int maxWaterQuantity(ArrayList<Integer> height) {
        // Return -1 if the height list is empty
        if (height.size() == 0) {
            return -1;
        }

        int maxQuantity = 0; // Stores the maximum water quantity found so far
        int containerLeftBoundary = -1; // Left index of the optimal container
        int containerRightBoundary = -1; // Right index of the optimal container

        // Iterate over all possible pairs of indices to find the optimal container
        for (int tower1 = 0; tower1 < height.size() - 1; tower1++) {
            for (int tower2 = tower1 + 1; tower2 < height.size(); tower2++) {
                // Determine the limiting height and calculate width between indices
                int waterHeight = Math.min(height.get(tower1), height.get(tower2));
                int width = tower2 - tower1;
                
                // Calculate the water quantity for the current pair of indices
                int waterQuantity = waterHeight * width;

                // Update maximum quantity and boundaries if a larger area is found
                if (maxQuantity < waterQuantity) {
                    containerLeftBoundary = tower1;
                    containerRightBoundary = tower2;
                    maxQuantity = waterQuantity;
                }
            }
        }

        // Print the indices of the optimal container for reference
        System.out.println("The area of container is from index: " + containerLeftBoundary + " to " + containerRightBoundary);
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
        System.out.println("Maximum water quantity allowed for this container is: " + maxWaterQuantity(height));
    }
}
