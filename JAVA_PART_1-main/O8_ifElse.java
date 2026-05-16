import java.util.Scanner;

public class ifElse_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User please enter the number: ");
        int num = sc.nextInt();
        // only if can work but only else cant work
        // no condition is passed with else
        // only one will work at a time
        if(num>10){
            System.out.println(num+ " is greater than 10");
        }
        else if (num ==0){
            System.out.println(num+" is equal to 0");
        }
        else{
            System.out.println(num+" is lesser than 0");
        }
        sc.close();
    }
}
