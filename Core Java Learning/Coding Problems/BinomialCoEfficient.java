import java.util.Scanner;

public class BinomialCoEfficient {
    public int factorial(int n) {
        int fact = 1;

        while (n >= 1) {
            fact *= n;
            n--;
        }

        return fact;
    }

    public float binomialCoefficient(int n, int r) {
        BinomialCoEfficient obj1 = new BinomialCoEfficient();
        int n_Sub_r = n - r;
        int subFact = obj1.factorial(n_Sub_r);
        int nFact = obj1.factorial(n);
        int rFact = obj1.factorial(r);
        int result = (nFact) / (rFact * subFact);
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinomialCoEfficient obj = new BinomialCoEfficient();

        System.out.print("enter value of n: ");
        int n = sc.nextInt();
        System.out.print("enter value of r: ");
        int r = sc.nextInt();

        float bi_coeff = obj.binomialCoefficient(n, r);

        System.out.println("The binomial coefficient of entered values is: " + bi_coeff);
        sc.close();
    }
}
