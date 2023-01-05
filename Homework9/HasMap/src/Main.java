import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    static Map <Integer, Product> product = new HashMap <>();

    public static void main(String[] args) {

        product.put(1, new Product("Молоко"));
        product.put(2, new Product("Хлеб"));
        product.put(3, new Product("Масло"));

        entry();
        keySet();
        values();
    }

    public static void entry() {
        for (Map.Entry<Integer,Product> item : product.entrySet()){
            System.out.printf("Key: %d Value: %s \n",item.getKey(), item.getValue().getName());
        }
    }

    public static void keySet() {
        Set <Integer> keys= product.keySet();
        System.out.println(keys);
    }


    public static void values() {
        for (Product values : product.values()) {
            System.out.print(values.getName() + " ");
        }
    }

//    Collection <Product> value = product.values();  -  почему дает ссылки на обьект и нельзя добавить name?

}