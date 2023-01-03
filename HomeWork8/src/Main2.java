import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

    // Регулярное выражение, описывающее ссылку
    //Создать программу, которая, используя регулярное выражение, умеет в тексте распознавать ссылку,
    // заканчивающуюся на .com. Текст можно вводить с клавиатуры


    public static void main(String[] args) {
    String site = "^[A-Za-z0-9+_.-]+\\.(com)$";
        System.out.println(Pattern.matches(site,"NewYear.com"));

    }


}
