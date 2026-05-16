class Keyword{
    String name = "Default";
    int id = 54;
    char batch = 'F';
    void walk(){
        System.out.println("I can walk");
    }
    void talk(){
        System.out.println("I can talk");
    }
    void print(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.batch);
        this.walk();
        this.talk();
    }
}
public class O3_UnderstandingThis{
    public static void main(String[] args){

        Keyword sakshi1 = new Keyword();
        sakshi1.name = "Sakshi";
        sakshi1.id = 23;
        sakshi1.batch = 'A';
        
        Keyword sakshi2 = new Keyword();
        sakshi2.name = "Himani";
        sakshi2.id = 85;
        sakshi2.batch = 'u';

        Keyword sakshi3 = new Keyword();
        sakshi3.name = "xyz";
        sakshi3.id = 12;
        sakshi3.batch = 'q';

        sakshi1.print();
        sakshi2.print();
        sakshi3.print();
    }
}