import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] list = {"Катя", "Катя", "Вася","Петя","Петя"};

        countValues(list);

        System.out.println(countValues(list).toString());
    }


    public static <K> Map<K, Integer> countValues(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        for (int i =0; i < ks.length; i++){
            int amount = 1;
            K key = ks[i];
            if (map.containsKey(key) == true){
                amount = map.get(key) + 1;
            }
            map.put(key, amount);
        }
        return map;
    }
}

