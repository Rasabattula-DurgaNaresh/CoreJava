class Base2{
    void func1(){
        System.out.println("Hey i am func 1 of Base2");
    }
    void func2(){
        System.out.println("Hey i am func 2 of Base2");
    }
}
class Derived2 extends Base2{
    // void func1(){
    //     System.out.println("Hey i am func 1 of Base2");
    // }
    // void func2(){
    //     System.out.println("Hey i am func 2 of Base2");
    // }
    void func3(){
        System.out.println("Hey i am func 3 of Derived2");
    }
    @Override
    void func2(){
        System.out.println("Hey i am func 2 of Derived2");
    }
}
public class O7_MethodOverriding {
    public static void main(String[] args) {
        Base2 obj1 = new Base2();
        Derived2 obj2 = new Derived2();
        obj1.func1();
        obj1.func2();
        obj2.func3();
        obj2.func1();
        obj2.func2();
    }
}