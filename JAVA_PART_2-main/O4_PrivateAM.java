class GetterAndSetter{
    private String password;
    void set(String name){
        this.password = name;
    }
    void get(){
        System.out.println("This is a private password which is accessed by getter "+this.password);
    }
}
public class O4_PrivateAM {
    public static void main(String[] args) {
        // 4 types of AM in java : public private protected default
        GetterAndSetter obj = new GetterAndSetter();
        // obj.password =  "Sakshi";
        obj.set("Sakshi");
        obj.get();
    }
}
