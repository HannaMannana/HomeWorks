import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String name = scan.nextLine();
        System.out.print("Введите возраст: ");
        int age = scan.nextInt();
        String site = "[A-Za-zа-яА-Я ]+";
        System.out.println();

        try {
            if (name.length() > 199 || !Pattern.matches(site, name)) {
                throw new IncorrectInfoException(name);
            }
            System.out.println("Нормальное завершение.");
        } catch (IncorrectInfoException e) {
            System.out.println("Перехваченное исключение." + e);
            e.printStackTrace();

        }
        try {
            if (age > 99 || age < 1) {
                throw new IncorrectInfoException(age);
            }
            System.out.println("Нормальное завершение.");
        } catch (IncorrectInfoException e) {
            System.out.println("Перехваченное исключение." + e);
            e.printStackTrace();
        }

    }
}



// Создайте новое исключение и назовите его IncorrectInfoException,
// добавьте в него поля для возраста и ФИО. Напишите программу,
// которая просит пользователя ввести ФИО через пробел и возраст.
// Если Возраст больше 100 или меньше 0, то «бросать» IncorrectInfoException,
// записывать в него данные пользователя и сообщение о том, что возраст некорректен.
// Если ФИО длиннее 200 символов, или использовались символы пунктуации (.,!?& и тд),
// то тоже бросать исключение и записывать в него сообщение о некорректности данных и сами данные.
// В обработке исключения выводить на экран трассированный стек