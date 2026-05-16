class Base3 {
    Base3(){
        System.out.println("Base3");
    }
    void func1() {
        System.out.println("Hey i am func 1 of Base3");
    }

    void func2() {
        System.out.println("Hey i am func 2 of Base3");
    }
}

class Derived3 extends Base3 {
    Derived3(){
        System.out.println("Derived3");
    }
    void func3() {
        System.out.println("Hey i am func 3 of Derived3");
    }

    @Override
    void func2() {
        System.out.println("Hey i am func 2 of Derived3");
    }
}

public class O8_DynamicMethodDispatch {
    public static void main(String[] args) {
        // Base3 obj1 = new Base3();
        // Derived3 obj2 = new Derived3();
        // obj1.func2();
        // obj2.func2();
        // parent --> child
        // Derived3 obj4 = new Base3(); --> wrong
        Base3 obj3 = new Derived3(); // refer by base3 object of Derived3
        obj3.func1();
        obj3.func2();
        // obj3.func3();


    }
}
