import java.util.Scanner;

public class TwoDArrray_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) { // 0 1
            for (int j = 0; j < 3; j++) { // 0 1 2
                System.out.println("Enter element at arr " + i + " " + j + " :");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < 3; i++) { // 0 1
            for (int j = 0; j < 3; j++) { // 0 1 2
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
