abstract class Base4 {
    void func1() {
        System.out.println("Hey i am func 1 of Base4");
    }

    void func2() {
        System.out.println("Hey i am func 2 of Base4");
    }

    abstract void func4();

    abstract void func5();
}

class Derived4 extends Base4 {
    void func3() {
        System.out.println("Hey i am func 3 of Derived4");
    }

    @Override
    void func2() {
        System.out.println("Hey i am func 2 of Derived4");
    }

    // fix kr diya
    void func4() {
        System.out.println("Hey i am implementing abstract method");
    }

    void func5() {
        System.out.println("Hey i am implementing abstract method");
    }
}

public class O9_Abstract {
    public static void main(String[] args) {
        // Base4 obj1 = new Base4(); --> cant make an object if our class is abstract
        // Derived4 obj2 = new Derived4();
    }
}
