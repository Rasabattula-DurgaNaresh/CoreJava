import java.util.Scanner;

public class MultipleIf_9 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User please enter the number: ");
        int num = sc.nextInt();
        sc.close();
        if(num > 0){
            System.out.println("Greter than 0");
        }
        if(num>10){
            System.out.println("Greter than 10");
        }
        if(num>100){
            System.out.println("Greter than 100");
        }
        if(num>1000){
            System.out.println("Greter than 1000");
        }
    }
}
