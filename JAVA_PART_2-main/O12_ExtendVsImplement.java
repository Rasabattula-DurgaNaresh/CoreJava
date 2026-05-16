interface nokia{
    void rings();
    void snake();
}
interface apple extends nokia{
    void ui();
    void security();
}
class Phone implements apple{
    public void ui(){
        System.out.println("Useful");
    }
    public void security(){
        System.out.println("mast");
    }
    public void rings(){
        System.out.println("phone rings");
    }
    public void snake(){
        System.out.println("eat");
    }
}


public class O12_ExtendVsImplement {
    public static void main(String[] args) {
        
    }
}
