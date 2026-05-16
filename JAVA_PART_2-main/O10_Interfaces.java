interface Car{
    final int speed = 40; // final by default
    void start();
    void stop();
    default void engine(){
        System.out.println("I am engine or brain of the car");
    }
}
class Implementation implements Car{
    public void start(){
        System.out.println("I am starting my car");
    }
    public void stop(){
        System.out.println("I stopped my car");
    }
}
public class O10_Interfaces {
    public static void main(String[] args) {
        // Car a = new Car();
        Implementation a = new Implementation();

        System.out.println(Implementation.speed);
        // a.speed = 34; --> we cant change the value of speed
        System.out.println(Implementation.speed);
        a.start();
        a.stop();

    }
}
