public class TypeCasting_7 {
    public static void main(String[] args) {
        // Widening casting (auto) and Narrowing casting :
            // byte -> short -> char -> int -> long -> float -> double
        // 65 to 90 --> A to Z
        // 97 to 122 --> a to z

        char ch = 'n';
        int num = ch;
        System.out.println(ch);
        System.out.println(num);

        System.out.println();
        
        int num2 = 97;
        char ch2 = (char)num2;
        System.out.println(num2);
        System.out.println(ch2);
    }
}
