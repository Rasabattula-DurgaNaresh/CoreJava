import java.util.Scanner;

public class Strings_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the str: ");
        String str5 = sc.next();
        System.out.println(str5);

        sc.nextLine();

        System.out.println("Enter the str: ");
        String str3 = sc.nextLine();
        System.out.println(str3);

        String str = "Sakshi Goyal Goyal";
        String str2 = "sakshi goyal goyal";

        System.out.println(str);
        System.out.println(str.length()); // 12
        System.out.println(str.toUpperCase()); // SAKSHI GOYAL
        System.out.println(str.toLowerCase()); // sakshi goyal
        System.out.println(str.indexOf("shi")); // 3 (returns -1 if not present)
        System.out.println(str.lastIndexOf("Goyal")); // piche se sbse pehle kab aa rha hai
        System.out.println(str.equals(str2)); // case sensitive
        System.out.println(str.equalsIgnoreCase(str2)); // case insensitive
        String newstr = "            Sakshi            Goyal            ";
        System.out.println(newstr);
        System.out.println(newstr.trim());
        System.out.println(str.charAt(5));
        System.out.println(str.endsWith("thank you"));
        System.out.println(str.startsWith("Sas"));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 6));
        System.out.println(str.replace('S', 's'));

        System.out.println(str + " " + str2);
        System.out.println(str.concat(str2));

        System.out.println("\"Divine\" is a rapper\nthis is a new line");
        System.out.println("\"kr$na\" is a rapper\tthis is a new line");
        System.out.println("Whom do you like kr$na\\muhfaad");
        sc.close();

        for (int i = 0; i < str.length(); i++) {
        System.out.print(str.charAt(i));
        }
        System.out.println();
        for(char ch : str.toCharArray()){
        System.out.print(ch);
        }

    }
}
