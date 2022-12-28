import java.util.Scanner;

public class Reader {
    String surname;
    String name;
    int number;
    String faculty;
    int date;
    int tel;
    Book[] books = new Book[10];


    String printFullName() {

        return surname + " " + name;
    }

    int personNumber (){

        return number;
    }

//    void takeBook(Book book) {
//        int counter = 0;
//
//        for (int i = 0; i < books.length; i++) {
//            if (books[i] != null) {
//                counter++;
//            }
//        }
//        books[counter] = book;
//        System.out.println(books[counter].name);
//
//
//    }

    void takeBook(Book book) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i]=book;
                break;
            } else {
                System.out.println("Пользователь не может взять книгу");
            }
        }
        System.out.println(book.name);




    }

    void returnBook(Book book) {

        boolean isFound = false;

        for (int i = 0; i < books.length; i++) {
            if ((books[i].name.equals(book.name)) && books[i].authorName.equals(book.authorName)) {
                System.out.println(printFullName() + " вернул(а) книгу " + book.infoBook());
                books[i] = null;
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println(printFullName() + " не хранит книгу " + book.infoBook());

        }
    }





    void printStatus() {
        int k = 0;

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                k++;
            }
        }
        System.out.print(printFullName() + " " + "взял (а) " + k + " книги: ");

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                    System.out.print(books[i].infoBook());
                if (i != k - 1) {
                    System.out.print(",");
                }
            }

        }

    }

    String printPerson (){
        Scanner scan = new Scanner(System.in);
        Reader reader1 = new Reader();
        System.out.print("Введите фамилию: ");
        reader1.surname = scan.nextLine();
        System.out.print("Введите инициалы: ");
        reader1.name = scan.nextLine();
        return surname + " " + name;
    }



}











/**
        - Методы takeBook, returnBook, printStatus.
 - printStatus, который будит выводить информацию о читателе в формате «Петров В. В. взял 3 книги:
 Мастер и Маргарита, Война и Мир, Люпен», т.е. сперва имя фамилию, потом инициалы имени и отчества, после чего двоеточие
 и перечисление через запятую названий книг, которые сейчас находятся у читателя

 ++- takeBook, который будет принимать объект Book, добавлять его в массив взятых книг и выводить на экран
 сообщение формата «Петров В.В. взял книгу Игра Эндера»
 - returnBook, который будет принимать название книги. Если такая книга хранится у читателя,
 убрать её из массива и вывести сообщение формата «Петров В.В. вернул книгу Игра Эндера». Если же такой книги в читателя нет,
 вывести сообщение формата «Петров В.В. не хранит книгу Игра Эндера»
 */

