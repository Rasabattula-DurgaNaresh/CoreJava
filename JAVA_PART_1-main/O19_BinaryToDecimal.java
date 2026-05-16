import java.util.Scanner;

public class BinaryToDecimal_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int i = 0;
        int ans = 0;
        while(number != 0){
            int temp = number % 10;
            ans += temp * Math.pow(2,i++);
            number = number / 10;
        }
        System.out.println(ans);
    }
}
