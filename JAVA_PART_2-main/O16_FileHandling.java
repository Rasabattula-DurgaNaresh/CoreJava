import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class O16_FileHandling {

    public static void main(String[] args) {
        // Creating a file
        File createFile = new File("sakshi.txt");
        try {
            createFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing data in a file
        try{
                FileWriter writeFile = new FileWriter("sakshi.txt");
                writeFile.write("Hey welcome to the javify course on Sakshi Codes\nthis is new course.\t Ok i am well.");
                writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading data from a file
        File readFile = new File("sakshi.txt");
        try {
            Scanner sc = new Scanner(readFile);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        readFile.delete();
    }
}
