import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Reader reader = new Reader();

        System.out.print("Введите фамилию: ");
        reader.surname = scan.nextLine();
        System.out.print("Введите инициалы: ");
        reader.name = scan.nextLine();

        Book book1 = new Book();
        System.out.println("Введите книгу: ");
        book1.name = scan.nextLine();
        System.out.println("Введите автора: ");
        book1.authorName = scan.nextLine();

        reader.takeBook(book1);
        reader.takeBook(book1);
        reader.printStatus();


    }
}










class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int action;

        Reader[] readers = new Reader[10];

        do {
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
                    Reader reader1 = new Reader();
                    System.out.print("Введите фамилию: ");
                    reader1.surname = scan.nextLine();
                    System.out.print("Введите инициалы: ");
                    reader1.name = scan.nextLine();
                    System.out.println("Введите номер ч билета: ");
                    reader1.number = scan.nextInt();
                    scan.nextLine();

                    boolean isFull = true;
                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] == null) {
                            readers[i] = reader1;
                            isFull = false;
                            break;
                        }
                    }
                    if (isFull) {
                        System.out.println("Количество читателей уже максимальное");
                    }
                    break;
                }

                case 2: {
                    Book book1 = new Book();
                    System.out.println("Введите книгу: ");
                    book1.name = scan.nextLine();
                    System.out.println("Введите автора: ");
                    book1.authorName = scan.nextLine();

                    System.out.print("Введите номер билета: ");
                    int number = scan.nextInt();
                    boolean found = false;
                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] != null && readers[i].number == number) {
                            readers[i].takeBook(book1);
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
                    Book book1 = new Book();
                    System.out.println("Введите книгу: ");
                    book1.name = scan.nextLine();
                    System.out.println("Введите автора: ");
                    book1.authorName = scan.nextLine();

                    System.out.print("Введите номер билета: ");

                    int number = scan.nextInt();
                    scan.nextLine();
                    boolean found = false; // false если не удалось найти польз.
                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] != null && readers[i].number == number) {
                            System.out.println(readers[i].books[i].name);
                            readers[i].returnBook(book1);
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
                    int number = scan.nextInt();
                    scan.nextLine();
                    boolean found = false;
                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] != null && readers[i].number == number) {
                            readers[i].printStatus();
                            System.out.println();
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
                        if (r != null) {
                            r.printStatus();
                            System.out.println();
                        }
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


