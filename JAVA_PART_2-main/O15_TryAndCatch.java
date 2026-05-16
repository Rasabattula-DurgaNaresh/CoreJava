import java.util.Scanner;

public class O15_TryAndCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();
        try {
            System.out.println("Your ans for " + a + " and " + b + " is " + a / b);
            
        } catch (Exception e) {
            System.out.println("This code is not running due to this particular exception: " + e);
        }
        sc.close();
    }
}
