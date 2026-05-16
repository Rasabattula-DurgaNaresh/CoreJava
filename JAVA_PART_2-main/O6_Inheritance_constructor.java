class Base1{
    Base1(){
        System.out.println("1 func in base1");
    }
    Base1(int y){
        System.out.println("2 func in base1 ");
    }
    public void call(){
        System.out.println("this is just to remove yellow lines");
    }
}
// Inherited class
class Derived1 extends Base1{
    Derived1(){
        super(45);
        System.out.println("3 func in Derived1");
    }
    Derived1(int y){
        super(y);
        System.out.println("4 func in derived1");
    }
}
public class O6_Inheritance_constructor {
    public static void main(String[] args) {
        // Base1 obj1 = new Base1();
        // Base1 obj2 =  new Base1(45);
        // Derived1 obj3 = new Derived1();
        // Derived1 obj4 = new Derived1(45);
    }
}
