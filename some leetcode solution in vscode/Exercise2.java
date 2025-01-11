public class Exercise2 {
    /*
    ! LEETCODE: `1672` `Richest Customer Wealth`
    
    ! in this exercise, we have a very unique problem..
    ! this problem is based on multidimensional array concept..

    ! here, we are given by a multidimensional array, where the array is supposed to be an account where multiple users and their wealth in different banks is stored...

    ! the first row is supposed to be a customer no.1 and its elements are points to its wealth in different bank accounts... follow the same concept...

    ! we have to find the richest person of all persons and return its wealth

    ! suppose the data is: account = [[2,8,7],[7,1,3],[1,9,5]];
    
    !   account = [
            ? customer 1: [2,8,7],
            * bank-balance-1 : 2
            * bank-balance-2 : 8
            * bank-balance-3 : 7
            * total-wealth   : 17
            
            ? customer 2: [7,1,3],
            * bank-balance-1 : 7
            * bank-balance-2 : 1
            * bank-balance-3 : 3
            * total-wealth   : 11
            
            ? customer 3: [1,9,5]
            * bank-balance-1 : 1
            * bank-balance-2 : 9
            * bank-balance-3 : 5
            * total-wealth   : 15
        ]

        ?   here the richest person of all is 'customer 1' and we have to return its wealth is '17'..
    */
    
    static int maxWealth = 0;
    
    public static void findRichestOne(int arr[][]) {
        
        // ? alternative version of the same loop structure...
        
        for (int customer = 0; customer < arr.length; customer++) {
            int sumOfWealth = 0;

            for (int bank = 0; bank < arr[customer].length; bank++) {
                sumOfWealth = sumOfWealth + arr[customer][bank];
            }

            if (maxWealth < sumOfWealth) {
                maxWealth = sumOfWealth;
            }
        }
    }

    public static void main(String[] args) {
        int account[][] = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        findRichestOne(account);
        System.out.println("maximum wealth of all person's is: " + maxWealth);
    }
}
