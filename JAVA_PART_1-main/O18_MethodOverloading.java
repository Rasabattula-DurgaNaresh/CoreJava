public class MethodOverloading_18 {
    static int sum(int a , int  b){
        return a+b;
    }
    // change no of parameters (previous --> 2 and current --> 1)
    static int sum( int  b){
        int c = 5;
        return c+b;
    }
    // change datatype (previous --> int and current --> double)
    static double sum(double a , double  b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3));
        System.out.println(sum(3,6));
        System.out.println(sum(3.45,6.54));
        // System.out.println(c); 
    }
}
