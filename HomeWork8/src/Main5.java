import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату: ");
        String str = scanner.nextLine();
        String date = "(1[0-9][0-9][0-9]|200[0-9]|201[12])/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01]) ";
        String hours = "(0?[0-9]|1[0-9]|2[023]):(0?[0-9]|[1-5][0-9])";
        StringBuilder strBuilder = new StringBuilder(date);
        strBuilder.append(hours);
        System.out.println(Pattern.matches(String.valueOf(strBuilder),str));
    }
}

//Выбрать существующие даты между 1000 и 2012 годом.
// Секунды могут быть опущены. В каждом месяце 30 дней.
// То есть дата в определённом формате вводится с клавиатуры, после чего,
// с помощью регулярного выражения, определяется, существует такая дата, или нет. Пример:
//2012/09/18 12:10 – существует
//2012/24/18 12:10 – не существует