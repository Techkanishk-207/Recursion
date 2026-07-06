import java.util.Scanner;

public class Recursion3 {

    // Parameterised Method for sum
    static void Printsum(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        Printsum(n - 1, sum + n);
    }

    // Function Method for sum
    static int Printsum2(int n) {
        if (n < 1) {
            return 0;
        } else {
            return n + Printsum2(n - 1);
        }
    }

    // Function Method for Factorial
    static int Printfact2(int n) {
        if (n < 1) {
            return 1;
        } else {
            return n * Printfact2(n - 1);
        }
    }

    // Parameterised Method for Factorial
    static void Printfact(int n, int fact) {
        if (n < 1) {
            System.out.println(fact);
            return;
        }
        Printfact(n - 1, fact * n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Printsum(x, 0); // Parameterised Method

        System.out.println("Sum = " + Printsum2(x)); // Function Method

        System.out.println("Factorial = " + Printfact2(x)); // Function method for factorial

        Printfact(x, 1); // Parameterised Method for factorial
        
        sc.close();
    }
}
