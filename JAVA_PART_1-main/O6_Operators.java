public class Operators_6 {
    public static void main(String[] args) {
        // Arithmetic Assignment Comparison Logical 

        System.out.println("Arithmetic operator");
        int x = 56;
        System.out.println(40+5); // 45
        System.out.println(40-5); // 35
        System.out.println(40/5); // 8  --> quotient 
        System.out.println(40%5); // 0  -->  remainder
        System.out.println(40*5); // 200
        System.out.println(x++); // print = 56  --> x = 57 
        System.out.println(++x); // x = 58 --> print = 58
        
        System.out.println("Assignment operator");
        int y = 55;
        y += 2;  // y = y+2  --> 57
        System.out.println(y);
        y -= 10;  // 47 
        System.out.println(y);
        y *= 10;  // 470
        System.out.println(y);
        y /= 10;  // 47 
        System.out.println(y);
        y %= 10;  // 7 
        System.out.println(y);

        System.out.println("Comparison operator");
        int m = 45;
        int n = 50;
        System.out.println(m>n);   // f
        System.out.println(m<n);   // t
        int i = 2;
        int j = 2;
        System.out.println(i>=j);  // t
        System.out.println(i<=j);  // t
        int k = 5;
        int l = 5;
        System.out.println(k==l);
        System.out.println(k!=l);

        System.out.println("Logical operator");
        /*  
        && --> and
            t t --> t
            t f --> f
            f t --> f
            f f --> f
        */

        /*  
        || --> or
            t t --> t
            t f --> t
            f t --> t
            f f --> f
        */

        /*  
        !  --> not
            t --> f
            f --> t
        */

        int num1 = 350;
        System.out.println(num1>10 && num1 >100);  // t  t  --> t 
        System.out.println(num1>10 && num1 >1000);  // t  f  --> f
        System.out.println();
        System.out.println(num1>10 || num1 >100);  // t  t  --> t 
        System.out.println(num1>10 || num1 >1000);  // t  f  --> t
        System.out.println(num1>1000 || num1 >10000);  // f  f  --> f
        System.out.println();
        System.out.println(!(num1>10));  // !(t) --> f
    }
}
