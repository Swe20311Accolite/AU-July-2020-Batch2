import java.util.Scanner;
import java.util.*;
public class pg1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        System.out.println("Enter regex of string");
        String s1=sc.nextLine();
        System.out.println("replacement String");
        String s2=sc.nextLine();
        s = s.replaceFirst(s1, s2);
        System.out.println(s);
    }
}

