import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

/**
 * dz_05
 */
public class dz_05 {

    public static void main(String[] args) {
        // HashMap<Integer,String> map = new HashMap<>();
        // map.put(0,"Черный");
        // map.put(1,"Белый");
        // map.put(2,"Серый");
        // System.out.println(map.get(1));
        // map.put(0,"Черный!");
        // map.put(1,"Белый!");
        // map.put(2,"Серый!");
        // System.out.println(map);
        TreeMap<Integer,String> map = new TreeMap<>();
        for (int i = 0; i < 1000; i++) {
            Random r = new Random();
            map.put(r.nextInt(1000),"Общая строка");
        }
        System.out.println(map);
        
    }
}