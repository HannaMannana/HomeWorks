import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

    public static void main(String[] args) {
    String str = "ahb acb aeb aeeb adcb axeb";
        Pattern pattern = Pattern.compile("a.b\\w*");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }


    }

    // Дана строка 'ahb acb aeb aeeb adcb axeb'. Напишите регулярное выражение,
    // которое найдет строки ahb, acb, aeb по шаблону: буква 'a', любой символ, буква 'b'.
}
