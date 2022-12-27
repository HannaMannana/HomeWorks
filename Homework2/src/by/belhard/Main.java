package by.belhard;

import java.util.Scanner;

/**
 * 1. Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
 * Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью
 */


public class Main {
    public static void main(String[] args) {
        int min = 10;
        int max = 99;
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min)) + min;
        }
        for (int a : array) {
            System.out.println(a);
        }
        if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3]) {
            System.out.println("Массив строго возврастающей последовательности");
        } else {
            System.out.println("Нет строгой последовательности");
        }
    }
}

/**
 * 2. Попросить пользователя ввести с клавиатуры сперва размер массива, потом нижний диапазон значений и верхний.
 * После чего создать массив размером, который ввел пользователь и заполнить его случайными числами из диапазона,
 * введенного пользователем. Если пользователь ввел неверные значения (отрицательный размер массива, нижняя граница
 * диапазона больше верхнего и т.д.) попросить его ввести значение ещё раз и перезаписать старое значение новым.
 * Вывести массив на экран (Для этого удобнее пользоваться не println, а print)
 */


class Main1 {
    public static void main(String[] args) {
        int n = 0;
        int a = 0;
        int b = 0;

        while (true) {
            System.out.print("Введите размер массива: ");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            if (n < 0) {
                System.out.println("Введите положительный размер массива");
            } else {
                break;
            }
        }
        while (true) {
            System.out.print("Введите нижний диапазон массива: ");
            Scanner scan1 = new Scanner(System.in);
            a = scan1.nextInt();
            System.out.print("Введите верхний диапазон массива: ");
            Scanner scan2 = new Scanner(System.in);
            b = scan2.nextInt();
            if(a>b){
                System.out.println("Нижняя граница диапазона больше верхнего");
            } else {
                break;
            }
        }
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b- a)) + a;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}



/**
 * 3. Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
 * Определите какой элемент является в этом массиве максимальным и сообщите его индекс
 */

class Main2 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("Введите нижний диапазон массива: ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        System.out.print("Введите верхний диапазон массива: ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a)) + a;
        }
        for (int c : array) {
            System.out.print(c + " ");
        }

        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            int j = array[i];
            if (max < j) {
                max = j;
                index = i;
            }
        }
        System.out.println("Максимальное значение " + index);
    }
}


/**
 * 4. Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
 * Выведите массив на экран, после чего отсортируйте его с помощью сортировки «пузырьком» и выведите
 * уже отсортированный массив
 */

class Main3 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("Введите нижний диапазон массива: ");
        int a = scan.nextInt();
        System.out.print("Введите верхний диапазон массива: ");
        int b = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a)) + a;
        }
        for (int c : array) {
            System.out.print(c + " ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int d = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = d;
                }
            }
        }
        System.out.println();
        for (int c : array) {
            System.out.print(c + " ");
        }

    }
}


    /**
     * 5. Создать и проинициализировать массив из 20 элементов. Ввести с клавиатуры число n и найти,
     * есть ли оно в массиве, и, если есть, вывести его индекс на экран. Использовать линейный поиск
     */

    class Main4 {
        public static void main(String[] args) {
            System.out.print("Введите число: ");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] array = {1, 5, 2, 8, 10, 11, 16, 106, 7, 43, 27, 4, 71, 32, 55, 21, 6, 30, 40, 69};
            int index = -1;
            int value = n;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    index = i;
                    System.out.println(i);
                    break;
                }
            }
        }
    }


    /**
     * 6. Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
     * Выведите массив на экран, после чего инвертируйте его и выведите уже инвертрованный массив
     */

    class Main5 {
        public static void main(String[] args) {
            System.out.print("Введите размер массива: ");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            System.out.print("Введите нижний диапазон массива: ");
            Scanner scan1 = new Scanner(System.in);
            int a = scan1.nextInt();
            System.out.print("Введите верхний диапазон массива: ");
            Scanner scan2 = new Scanner(System.in);
            int b = scan2.nextInt();

            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * (b - a)) + a;
            }
            for (int c : array) {
                System.out.print(c + " ");
            }
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - i - 1] = temp;
            }
            System.out.println();
            for (int c : array) {
                System.out.print(c + " ");
            }
        }
    }

    /**
     * 7. Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
     * Вывести массив на экран, после чего ввести с клавиатуры число k, найти индекс этого числа в массиве
     * сперва линейным поиском, потом двоичным и вывести на экран этот индекс, если число есть в массиве,
     * и количество «шагов», которое каждый алгоритм потратил на выполнение задачи. Например:
     * Введите размер массива
     * 9
     * Введите нижний диапазон
     * 0
     * Введите верхний диапазон
     * 10
     * Массив: 5, 2, 7, 2, 3, 8, 6, 1, 8
     * Введите искомое значение
     * 3
     * Индекс элемента: 4
     * Линейный поиск: 5 шаг(-а)(-ов)
     * Двоичный поиск: 1 шаг(-а)(-ов)
     */
    class Main6 {
        public static void main(String[] args) {
            System.out.print("Введите размер массива: ");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            System.out.print("Введите нижний диапазон массива: ");
            int a = scan.nextInt();
            System.out.print("Введите верхний диапазон массива: ");
            int b = scan.nextInt();

            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * (b - a)) + a;
            }
            for (int c : array) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.print("Введите искомое значение: ");
            int k = scan.nextInt();
            int index = -1;
            int value = k;
            int step = 0;
            for (int i = 0; i < array.length; i++) {
                step = step + 1;
                if (array[i] == value) {
                    index = i;
                    System.out.println("Индекс элемента: " + i);
                    break;
                }
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int d = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = d;
                    }
                }
            }

            System.out.println("Линейный поиск: " + step);
            int step2 = 0;
            int lowIndex = 0;
            int highIndex = array.length - 1;
            int elementIndex = -1;
            while (lowIndex <= highIndex) {
                int midIndex = (lowIndex + highIndex) / 2;
                step2 = step2 + 1;
                if (value == array[midIndex]) {
                    elementIndex = midIndex;
                    break;
                } else if (value < array[midIndex]) {
                    highIndex = midIndex - 1;
                } else if (value > array[midIndex]) {
                    lowIndex = midIndex + 1;
                }
            }
            System.out.println("Двоичный поиск: " + step2);
        }
    }


    /**
     * Строки 1. Написать программу, в которой вводятся с клавиатуры сперва строка, а потом символ.
     * После чего в консоль выводится количество вхождений символа в строку. Например, строка «Java 11», символ «a», результат: 2
     */

    class Main7 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String str = scan.nextLine();
            System.out.print("Введите символ: ");
            char a = scan.next().charAt(0);
            int step = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == a) {
                    step++;
                }
            }

            System.out.println(step);
        }
    }


    /**
     * С клавиатуры вводится любая строка. Если она пустая, выводится сообщение с просьбой повторить ввод.
     * Далее с клавиатуры вводятся два символа (a и b), после чего нужно вывести строку, в которой все символы
     * a нужно заменить на символы b. Пример: срока – «Java 11», символы «1» и «H», результат «Java HH»
     */

    class Main8 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String string1 = "";
            while (true) {
                System.out.print("Введите строку: ");
                String str = scan.nextLine();
                if (str != "") {
                    string1 = str;
                    break;
                } else {
                    System.out.println("Повторите ввод");
                }
            }
            System.out.print("Введите символ 1: ");
            char a = scan.next().charAt(0);
            System.out.print("Введите символ 2: ");
            char b = scan.next().charAt(0);

            StringBuilder newString = new StringBuilder(string1);

            for (int i = 0; i < string1.length(); i++) {
                if (string1.charAt(i) == a) {
                    newString.setCharAt(i, b);
                }
            }
            System.out.println(newString);
        }
    }


    class Main9 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String string1 = "";
            while (true) {
                System.out.print("Введите строку: ");
                String str = scan.nextLine();
                if (str != "") {
                    string1 = str;
                    break;
                } else {
                    System.out.println("Повторите ввод: ");
                }

            }
            System.out.print("Введите символ 1: ");
            char a = scan.next().charAt(0);
            System.out.print("Введите символ 2: ");
            char b = scan.next().charAt(0);

            char[] array = string1.toCharArray();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == a) {
                    array[i] = b;
                }
            }
            System.out.println(array);
        }

    }






