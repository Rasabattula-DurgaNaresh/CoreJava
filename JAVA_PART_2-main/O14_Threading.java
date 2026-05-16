class ThreadExtend1 extends Thread{
    @Override
    public void run(){
        for(int i = 0 ;i<50 ; i++){
            System.out.println("Hola amigo");
        }
    }
}
class ThreadExtend2 extends Thread{
    @Override
    public void run(){
        for(int i = 0 ;i<50 ; i++){
            System.out.println("Hey");
        }
    }
} 
// Method 2 for implemeting thread
class ThreadImplement implements Runnable{
    @Override
    public void run(){
        for(int i = 0 ;i<50 ; i++){
            System.out.println("Sakshi");
        }
    }
} 
public class O14_Threading {
    public static void main(String[] args) {
        ThreadExtend1 obj1 = new ThreadExtend1();
        ThreadExtend2 obj2 = new ThreadExtend2();
        // obj1.run();
        // obj2.run();
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.NORM_PRIORITY);
        obj1.start();
        obj2.start();
        ThreadImplement obj3 = new ThreadImplement();
        // obj3.run();
        new Thread(obj3).start();
    }
}
