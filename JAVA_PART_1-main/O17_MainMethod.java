public class MainMethod_17 {
    // aka functions
    // camelNaming --> methods variables
    // PascalNaming --> class
    // snake_typing

    static void greet() {
        System.out.println("Good morning");
    }

    static void paraGreet(String name) {
        // String  name = "Sakshi";
        System.out.println("Good morning " + name);
    }

    static int sum(int a , int b){
        System.out.println(a);
        System.out.println(b);
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("hola amigo");
        greet();
        System.out.println("ok");
        greet();
        paraGreet("Sakshi");
        paraGreet("Himani");
        System.out.println(sum(2,3));

    }
}
