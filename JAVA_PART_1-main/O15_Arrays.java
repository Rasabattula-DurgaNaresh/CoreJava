import java.util.Scanner;

public class Arrays_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declare and initialize different kinds of arrays of different data types.

        // String[] clr = { "Red", "Green", "Black", "Orange" };
        // int[] num = { 1, 2, 3, 4 };
        // char[] ch = { 'a', 'b', 'c', 'd' };

        // declare and memory allocate

        // String[] colour;
        // colour = new String[5];
        
        // above two lines and below single line is same
        int[] numbers = new int[5];

        // assigning values to an array numbers using index
        numbers[0] = 12;
        numbers[1] = 24;
        numbers[2] = 35;
        numbers[3] = 48;
        numbers[4] = 52;
        // numbers[5] = 100;  // cant assign extra value when we have alredy created memory of 5

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        // System.out.println(numbers[5]);  
         
        System.out.println("for each loop");
        for (int element : numbers) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println("For loop");
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // taking input from user for an array
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the " + (i + 1) + " th element: ");
            nums[i] = sc.nextInt();
        }

        // trying to change a value in an array
        String[] names = { "Himani", "Sakshi", "Tarun", "Akshay" };
        names[1] = "Sakshi goyal";
        for (String element : names) {
            System.out.print(element + " ");
        }
        sc.close();
    }
}