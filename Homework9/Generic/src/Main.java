import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] list = {"Катя", "Петя", "Вася"};

        countValues(list);

        System.out.println(countValues(list).toString());
    }


    public static <K> Map<K, Integer> countValues(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        int i = 1;
        for (K k : ks) {
            map.put(k, i);
            i++;
        }
        return map;
    }
}

