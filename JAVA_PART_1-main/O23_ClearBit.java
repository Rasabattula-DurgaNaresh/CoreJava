public class ClearBit_23 {
    public static void main(String[] args) {
        int number = 10;
        int postition = 1;
        int bitmask = 1<<postition;
        int notMask = ~(bitmask);
        System.out.println(notMask & number);
    }
}
