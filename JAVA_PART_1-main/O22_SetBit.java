public class SetBit_22 {
    public static void main(String[] args) {
        int number = 5;
        int position = 1;
        int bitMask = 1<<position;
        System.out.println(number | bitMask);
    }
}
