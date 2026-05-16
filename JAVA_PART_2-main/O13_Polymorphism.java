interface Nokia{
    void rings();
    void snake();
}
class redmi{
    void on(){
        System.out.println("on");
    }
    void off(){
        System.out.println("off");
    }
}
class Phone extends redmi implements Nokia{
    public void rings(){
        System.out.println("rings");
    }
    public void snake(){
        System.out.println("game");
    }
    void selfpickup(){
        System.out.println("self");
    }
}
public class O13_Polymorphism {
    public static void main(String[] args) {
        Nokia a = new Phone();
        a.rings();
        a.snake();
        // a.selfpickup();
        redmi b = new Phone();
        b.on();
        b.off();
        // b.snake();

    }
}