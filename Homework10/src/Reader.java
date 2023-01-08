import java.io.Serializable;
import java.util.LinkedList;
import java.util.Scanner;

public class Reader implements Serializable {
    String surname;
    String name;
    String number;
    String faculty;
    int date;
    int tel;
    LinkedList <Book> books = new LinkedList<>();


    String printFullName() {

        return surname + " " + name;
    }

    String personNumber (){

        return number;
    }


    void takeBook(Book book) {
        books.add(book);
        System.out.println(printFullName() + " взял(а) книгу " + book.infoBook());
    }

    void returnBook(Book book) {

        boolean isFound = false;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(book)) {
                System.out.println(printFullName() + " вернул(а) книгу " + book.infoBook());
                books.remove(i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println(printFullName() + " не хранит книгу " + book.infoBook());
        }
    }





    void printStatus() {

        System.out.print(printFullName() + " " + "взял (а) " + books.size() + " книги: ");

        for (int i = 0; i < books.size(); i++) {
            System.out.print(books.get(i).infoBook());
                if (i != books.size() - 1) {
                    System.out.print(",");
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

