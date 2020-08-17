import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class reverse_order {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "h");
        m.put(2, "e");
        m.put(3, "l");
        m.put(4, "l");
        m.put(5, "o");
        System.out.println("map in the given order" + m);
        ArrayList<Integer> k = new ArrayList<Integer>(m.keySet());
        System.out.println("reverse order is:");
        for(int i=k.size()-1; i>=0;i--){
            System.out.printf(k.get(i)+"="+m.get(k.get(i)));
        }

    }
         }


