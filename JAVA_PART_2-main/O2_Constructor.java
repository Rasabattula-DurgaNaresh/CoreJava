class Const {
    // Default constructor
    Const() {
        System.out.println("Hey i am a default constructor");
        System.out.println("You have created a object of const class");
    }
    String name;
    int age;
    // Parameterized constructor
    Const(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("I am a Parameterized Constructor");
        System.out.println("This is a parameterized constructor named as " + name + " with age " + age);
    }
    // Copy constructor
    Const(Const obj2){
        System.out.println("I am a copy Constructor");
        this.name = obj2.name;
        this.age = obj2.age;
        System.out.println("This is a copy constructor named as " + name + " with age " + age);
    }
    public void call(){
        System.out.println("this is just to remove yellow lines");
    }
}

public class O2_Constructor {
    public static void main(String[] args) {
        Const obj = new Const(); // Along with object creation constructor is being called automatically.
        Const obj2 = new Const("Sakshi", 19);
        Const obj4 = new Const("HImani", 16);
        Const obj5 = new Const("Goyal", 20);
        Const obj3 = new Const(obj2);
        obj.call();
        obj2.call();
        obj3.call();
        obj4.call();
        obj5.call();
    }
}
