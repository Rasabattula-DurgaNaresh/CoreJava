import java.util.Scanner; // importing a Scanner class

public class Input_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a object

        System.out.print("Enter the num : ");
        int y = sc.nextInt();
        System.out.println("The value of y is : " + y);

        sc.close();
    }
}
