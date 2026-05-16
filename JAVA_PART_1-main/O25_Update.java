public class Update_25 {
    public static void main(String[] args) {
        int number = 5;
        int postition = 1;
        int bitMask = 1 << postition;
        int user = 0;
        if (user == 1) {
            System.out.println(number | bitMask);
        }
        if (user == 0) {
            int notMask = ~(bitMask);
            System.out.println(notMask & number);
        }
    }
}
