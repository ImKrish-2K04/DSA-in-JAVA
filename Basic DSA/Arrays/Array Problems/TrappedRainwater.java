public class TrappedRainwater {
    public static void trappedRainwater(int arr[]) {
        int len = arr.length;
        int rightHighestBuilding[] = new int[len];
        int leftHighestBuilding[] = new int[len];

        // initialising 0'th index with arr[0], because first value has no left highest builing than itself...
        leftHighestBuilding[0] = arr[0];

        // finding the left highest building of each elements and storing in an array at that index...
        for (int i = 1; i < len; i++) {
            leftHighestBuilding[i] = Math.max(leftHighestBuilding[i - 1], arr[i]);
        }

        // initialising (n-1)'th index with arr[n-1], because last value has no right highest builing than itself...
        rightHighestBuilding[len - 1] = arr[len - 1];

        // finding the right highest building of each elements and storing in array at that index...
        for (int i = len - 2; i >= 0; i--) {
            rightHighestBuilding[i] = Math.max(rightHighestBuilding[i + 1], arr[i]);
        }

        // following variables are taken for understanding that what we will be doing in our code...
        int barHeight, waterLvl, waterVolume, totalVolume = 0;

        for (int i = 0; i < len; i++) {
            barHeight = arr[i];

            // comparing whether LHS highest building and RHS highest building to determine water level, because water level should be minimum of both.
            waterLvl = Math.min(leftHighestBuilding[i], rightHighestBuilding[i]);

            // water volume can be counted by substracting the current building height from the current water level...
            waterVolume = (waterLvl - barHeight);

            // after finding the water volume of current building, we have added it to our totalVolume variable to calculate the total amount of trapped water...
            totalVolume += waterVolume;
        }

        System.out.println("the total trapped water is: " + totalVolume);
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        trappedRainwater(height);
    }
}
