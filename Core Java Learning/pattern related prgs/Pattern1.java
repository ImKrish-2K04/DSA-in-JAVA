public class Pattern1 {
    public static void main(String[] args) {

        /*

        * * * *
        * * * *
        * * * *
        * * * *
        
        ? without any boundaries

        for (int i = 1; i <= 4; i++) { // ? counting the rows
            for (int j = 1; j <= 4; j++) { // ? printing the stars
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        int n = 4, i = 1;
        // * n is a boundary value and it is used to create a matrix pattern. like here, 4x4
        
        while (i <= n) {
            // * this loop is intended for counting the total no of rows
            int j = 1;
            while (j <= n) {
                // * this loop is intended for printing the stars
                System.out.print("*");
                if (j != n) {
                    System.err.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
