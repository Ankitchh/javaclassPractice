import java.util.Scanner;
public class strMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
       int x = 2;
        int y = 5;
        System.out.format(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring( x));
        System.out.println(name.substring(x,y));
        System.out.println(name.replace('h','H'));
        System.out.println(name.startsWith("An"));
        System.out.println(name.endsWith("ri"));
        System.out.println(name.charAt(7));
        System.out.println(name.indexOf("r"));
        System.out.println(name.indexOf("r",4));
        System.out.println(name.lastIndexOf("r"));
        System.out.println(name.lastIndexOf("r",2));
        System.out.println(name.equals("Ankit"));
        System.out.println(name.equalsIgnoreCase("Ankit"));

    }
}
