import java.util.ArrayList;

public class foreachList4 {
    public static void main(String[] args)
    {
        ArrayList<Integer> l= new ArrayList<>();
           l.add(3);l.add(5);l.add(6);l.add(4);
           l.stream().forEach(i ->
           {
               if(i==3) return;
               System.out.println(i);
           });
    }
}

