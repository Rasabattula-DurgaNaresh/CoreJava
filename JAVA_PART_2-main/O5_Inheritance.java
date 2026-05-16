class Parent{
    String eye ;
    int x;
    int y;
    void math(){
        System.out.println("I am very good in maths");
    }
    void talk(){
        System.out.println("I am laughing");
    }
}
class Child extends Parent{
    void laugh(){
        System.out.println("My style");
    }
}
public class O5_Inheritance {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.eye = "ere";
        obj.x = 45;
        obj.y = 34;
        obj.math();
        obj.talk();
        Child obj2 = new Child();
        obj2.laugh();
        obj2.eye = "ere";
        obj2.x = 45;
        obj2.y = 34;
        obj2.math();
        obj2.talk();
    }
}
