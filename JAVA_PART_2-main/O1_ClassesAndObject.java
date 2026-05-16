class newClass{
    int x = 45;
    public void fun(){
        System.out.println("Hey");
    }
    static int himani = 56;
}
public class O1_ClassesAndObject{
    static int sakshi = 45;
    public static void main(String[] args) {
        // System.out.println(x);
        // fun();
        newClass obj = new newClass();
        System.out.println(obj.x);
        obj.x = 55;
        System.out.println(obj.x);
        obj.fun();
        System.out.println(O1_ClassesAndObject.sakshi);
        System.out.println(newClass.himani);
    }
}
//  Abstraction
//  Polymorphesim
//  Inheritance
//  Encapsulation