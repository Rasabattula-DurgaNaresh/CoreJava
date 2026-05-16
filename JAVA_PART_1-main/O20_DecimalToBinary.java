import java.util.Scanner;

public class DecimalToBinary_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int number = sc.nextInt();
        sc.close();
        int ans = 0;
        int multiplier = 1;
        while(number != 0){
            int temp = number % 2;
            ans = ans + temp * multiplier;
            multiplier *=10;
            number = number / 2;
        }
        System.out.println(ans);
    }
}
