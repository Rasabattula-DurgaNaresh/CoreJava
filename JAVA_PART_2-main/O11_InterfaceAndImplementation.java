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
}
public class O11_InterfaceAndImplementation {
    public static void main(String[] args) {
        Phone cell = new Phone();
        cell.rings();
        cell.snake();
        cell.on();
        cell.off();
    }
}
// class is implementing a interface (class-->interface)
// class extends another class (class-->class)
