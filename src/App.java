import java.util.*;
public class App{
    public static void main(String na[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("what's your name?");
        String name = sc.nextLine();
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("hello "+name);
        System.out.println("your age is "+age);
        System.out.println("length of your name "+name.length());
        int index =0;
        System.out.println("character at "+index+" is "+name.charAt(index));
        //jff
        String name1 = name.replace('N','A');
        String name2 = name.substring(0,2);
        System.out.println("new name = " + name1);
        System.out.println("new name = " + name2);
    }
}