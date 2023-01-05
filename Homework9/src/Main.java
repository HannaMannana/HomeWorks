import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Reader reader = new Reader();

        System.out.print("Введите фамилию: ");
        reader.surname = scan.nextLine();
        System.out.print("Введите инициалы: ");
        reader.name = scan.nextLine();

        Book book = new Book();
        System.out.println("Введите книгу: ");
        book.name = scan.nextLine();
        System.out.println("Введите автора: ");
        book.authorName = scan.nextLine();

        reader.takeBook(book);
        reader.takeBook(book);
        reader.printStatus();


    }
}










class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int action;

        ArrayList<Reader> readers = new ArrayList<>();

        do {
            System.out.println();
            System.out.println("1 -- Добавить нового читателя");
            System.out.println("2 -- Читатель хочет взять книгу");
            System.out.println("3 -- Читатель хочет вернуть книгу");
            System.out.println("4 -- Вывести статус читателя");
            System.out.println("5 -- Вывести статусы всех читателей");
            System.out.println("6 -- выйти из программы");
            System.out.println("Введите номер действия: ");
            action = scan.nextInt();
            scan.nextLine();

            switch (action) {
                case 1: {
                    Reader reader = new Reader();
                    System.out.print("Введите фамилию: ");
                    reader.surname = scan.nextLine();
                    System.out.print("Введите инициалы: ");
                    reader.name = scan.nextLine();
                    System.out.println("Введите номер ч билета: ");
                    reader.number = scan.nextLine();

                    readers.add(reader);
                    break;
                }

                case 2: {
                    Book book = new Book();
                    System.out.println("Введите книгу: ");
                    book.name = scan.nextLine();
                    System.out.println("Введите автора: ");
                    book.authorName = scan.nextLine();

                    System.out.print("Введите номер билета: ");
                    String number = scan.nextLine();

                    boolean found = false;
                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i).number.equals(number)) {
                            readers.get(i).takeBook(book);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 3: {
                    Book book = new Book();
                    System.out.println("Введите книгу: ");
                    book.name = scan.nextLine();
                    System.out.println("Введите автора: ");
                    book.authorName = scan.nextLine();

                    System.out.print("Введите номер билета: ");

                    String number = scan.nextLine();
                    boolean found = false;
                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i).number.equals(number)) {
                            readers.get(i).returnBook(book);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Введите номер билета: ");
                    String number = scan.nextLine();
                    boolean found = false;
                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i).number.equals(number)) {
                            readers.get(i).printStatus();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
//
                case 5: {
                    for (Reader r : readers) {
                            r.printStatus();
                            System.out.println();
                    }
                }

                case 6: {
                    System.out.println("Завешаем программу");
                    break;
                }
                default: {
                    System.out.println("Нет такой команды");
                }
            }
        } while (action != 6);
    }
}


