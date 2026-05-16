public class GetBit_24 {
    public static void main(String[] args) {
        int number = 5;
        int postition = 1;
        int bitmask = 1<<postition;
        if((bitmask & number) == 0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
}
