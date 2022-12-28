package by.BelHard;

import java.util.Scanner;


/**
 * ДЗ 1
 * <p>
 * <p>
 * /**
 * 1. Создать программу, проверяющую и сообщающую на экран, является ли целое число, записанное в переменную n, чётным либо нечётным
 */

public class Main {
    public static void main(String[] args) {
        int n = 4;
        if (n % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }

    }
}


/**
 * 2. Создать программу, в которой проинициализировать переменную типа int, после чего вывести на экран день недели,
 * соответствующий этому числу (1 – понедельник, 3 – среда и тд), если такого дня нет, вывести надпись,
 * что такого дня нет. Сделать реализацию через if-else и через switch
 */

class Main1 {
    public static void main(String[] args) {
        System.out.print("Введите число");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if (i == 1) {
            System.out.println("Понедельник");
        } else if (i == 2) {
            System.out.println("Вторник");
        } else if (i == 3) {
            System.out.println("Среда");
        } else if (i == 4) {
            System.out.println("Четверг");
        } else if (i == 5) {
            System.out.println("Пятница");
        } else if (i == 6) {
            System.out.println("Суббота");
        } else if (i == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Такого дня нет");
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        System.out.print("Введите число");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        switch (i) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня нет");
        }
    }
}


/**
 * 3. Даны три числа, каждое в своей переменной. Найти сумму двух наибольших из них
 */

class Main3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 12;
        int c = 3;
        if (a < b && a < c) {
            System.out.println(b + c);
        } else if (b < a && b < c) {
            System.out.println(a + c);
        } else if (c < a && c < b) {
            System.out.println(a + b);
        }
    }
}


/**
 * 4. Дан номер года (положительное целое число). Определить количество дней в этом году,
 * учитывая, что обычный год насчитывает 365 дней, а високосный — 366 дней.
 * Високосным считается год, делящийся на 4, за исключением тех годов,
 * которые делятся на 100 и не делятся на 400 (например, годы 300, 1300 и 1900 не являются високосными, а 1200 и 2000 — являются).
 */

class Main4 {
    public static void main(String[] args) {
        System.out.print("Введите год: ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if (i % 4 != 0) {
            System.out.println("Не високосный");
        } else if (i % 100 == 0 && i % 400 != 0) {
            System.out.println("Не високосный");
        } else {
            System.out.println("Високосный");
        }
    }
}


/**
 * 5. Арифметические действия над числами пронумерованы следующим образом:
 * 1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление.
 * Дан номер действия N (целое число в диапазоне 1–4) и вещественные числа A и B (В не равно 0).
 * Выполнить над числами указанное действие и вывести результат.
 */

class Main5 {
    public static void main(String[] args) {
        System.out.print("Введите число");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int a = 30;
        int b = 20;
        if (i == 1) {
            System.out.println(a + b);
        } else if (i == 2 && b != 0) {
            System.out.println(a - b);
        } else if (i == 3 && b != 0) {
            System.out.println(a * b);
        } else if (i == 4 && b != 0) {
            System.out.println(a / b);
        }
    }
}


/**
 * 6. Дано целое число, лежащее в диапазоне 0–999. Вывести строку-описание этого числа.
 * Строку-описание вида «четное двузначное число», «нечетное трехзначное число» и т. д.
 */

class Main6 {
    public static void main(String[] args) {
        System.out.print("Введите число ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if (i >= 0 && i < 10 && i % 2 == 0) {
            System.out.println("Однозначное четное");
        } else if (i >= 0 && i < 10 && i % 2 != 0) {
            System.out.println("Однозначное нечетное");
        } else if (i >= 10 && i < 100 && i % 2 == 0) {
            System.out.println("Двухзначное четное");
        } else if (i >= 10 && i < 100 && i % 2 != 0) {
            System.out.println("Двухзначное нечетное");
        } else if (i >= 100 && i <= 999 && i % 2 == 0) {
            System.out.println("Трехзначное четное");
        } else if (i >= 100 && i <= 999 && i % 2 != 0) {
            System.out.println("Трехзначное нечетное");
        }
    }
}


/**
 * 7. Даны два целых числа: D (день) и M (месяц), определяющие правильную дату. Вывести знак Зодиака,
 * соответствующий этой дате: «Водолей» (20.1–18.2), «Рыбы» (19.2–20.3), «Овен» (21.3–19.4), «Телец» (20.4–20.5),
 * «Близнецы» (21.5–21.6), (22.6-22.7), «Лев» (23.7–22.8), «Дева» (23.8–22.9), «Весы» (23.9–22.10), «Скорпион» (23.10–22.11),
 * «Стрелец» (23.11–21.12), «Козерог» (22.12–19.1).
 */

class Main7 {
    public static void main(String[] args) {
        System.out.print("Введите день: ");
        Scanner s1 = new Scanner(System.in);
        int d = s1.nextInt();
        System.out.print("Введите месяц: ");
        Scanner s2 = new Scanner(System.in);
        int m = s2.nextInt();
        if ((d >= 20 && m == 1 && d <= 31) || (d >= 1 && m == 2 && d <= 18)) {
            System.out.println("Водолей");
        } else if ((d >= 19 && m == 2 && d <= 29) || (d >= 1 && m == 3 && d <= 20)) {
            System.out.println("Рыбы");
        } else if ((d >= 21 && m == 3 && d <= 31) || (d >= 1 && m == 4 && d <= 19)) {
            System.out.println("Овен");
        } else if ((d >= 20 && m == 4 && d <= 30) || (d >= 1 && m == 5 && d <= 20)) {
            System.out.println("Телец");
        } else if ((d >= 21 && m == 5 && d <= 31) || (d >= 1 && m == 6 && d <= 21)) {
            System.out.println("Близнецы");
        } else if ((d >= 22 && m == 6 && d <= 30) || (d >= 1 && m == 7 && d <= 22)) {
            System.out.println("Рак");
        } else if ((d >= 23 && m == 7 && d <= 31) || (d >= 1 && m == 8 && d <= 22)) {
            System.out.println("Лев");
        } else if ((d >= 23 && m == 8 && d <= 31) || (d >= 1 && m == 9 && d <= 22)) {
            System.out.println("Дева");
        } else if ((d >= 23 && m == 9 && d <= 30) || (d >= 1 && m == 10 && d <= 22)) {
            System.out.println("Весы");
        } else if ((d >= 23 && m == 10 && d <= 31) || (d >= 1 && m == 11 && d <= 22)) {
            System.out.println("Скорпион");
        } else if ((d >= 23 && m == 11 && d <= 30) || (d >= 1 && m == 12 && d <= 21)) {
            System.out.println("Стрелец");
        } else if ((d >= 22 && m == 12 && d <= 31) || (d >= 1 && m == 1 && d <= 19)) {
            System.out.println("Козерог");
        }
    }
}


/**
 * 8. Мастям игральных карт присвоены порядковые номера: 1 — пики, 2 — трефы, 3 — бубны, 4 — червы.
 * Достоинству карт, старших десятки, присвоены номера: 11 — валет, 12 — дама, 13 — король, 14 — туз.
 * Даны два целых числа: N — достоинство (6 ≤ N ≤ 14) и M — масть карты (1 ≤ M ≤ 4).
 * Вывести название соответствующей карты вида «шестерка бубен», «дама червей», «туз треф» и т. п.
 */

class Main8 {
    public static void main(String[] args) {
        System.out.print("Введите достоинство: ");
        Scanner s2 = new Scanner(System.in);
        int n = s2.nextInt();
        System.out.print("Введите масть: ");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        switch (n) {
            case 6:
                System.out.print("Шестерка ");
                break;
            case 7:
                System.out.print("Семерка ");
                break;
            case 8:
                System.out.print("Восьмерка ");
                break;
            case 9:
                System.out.print("Девятка ");
                break;
            case 10:
                System.out.print("Десятка ");
                break;
            case 11:
                System.out.print("Валет ");
                break;
            case 12:
                System.out.print("Дама ");
                break;
            case 13:
                System.out.print("Король ");
                break;
            case 14:
                System.out.print("Туз ");
                break;
        }
        switch (m) {
            case 1:
                System.out.print("Пики ");
                break;
            case 2:
                System.out.print("Трефы ");
                break;
            case 3:
                System.out.print("Бубны ");
                break;
            case 4:
                System.out.print("Червы ");
                break;

        }
    }
}


/**
 * 1. Распечатать произвольное количество строк: “Task1”. “Task2”. …. Используем цикл while
 */

class Main9 {
    public static void main(String[] args) {
        String a = "Task";
        int i = 1;
        while (i <= 100) {
            System.out.println("Task" + i);
            i++;
        }

    }
}


/**
 * 2. Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.
 */

class Main10 {
    public static void main(String[] args) {
        int i = 0;
        int v = 0;
        do {
            i++;
            v = i * 5;
            System.out.println(v);
        } while (v < 100);
    }
}


class Main10v2 {
    public static void main(String[] args) {
        int i = 0;
        do {
            i += 5;
            System.out.println(i);
        } while (i < 100);
    }
}


/**
 * 3. Реализовать подсчет факториала используя цикл for. Результат вывести на экран
 */

class Main11 {
    public static void main(String[] args) {

        System.out.print("Введите число");
        Scanner inputFigure = new Scanner(System.in);
        int d = inputFigure.nextInt();
        int s = 1;
        for (int i = 1; i <= d; i++) {
            s = s * i;
        }
        System.out.println(s);
    }
}

/**
 * 4. Даны два целых числа A и B (A < B). Вывести в порядке убывания все целые числа,
 * расположенные между A и B (не включая числа A и B), а также количество N этих чисел.
 */

class Main12 {
    public static void main(String[] args) {
        int a = 30;
        int b = 50;
        for (int i = b - 1; i > a && i < b; i--) {
            System.out.println(i);
        }
        System.out.println("Количество чисел " + ((b - a) - 1));

    }
}

class Main12v2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int s = 0;
        for (int i = b - 1; i > a && i < b; i--) {
            System.out.println(i);
            s += 1;
        }
        System.out.println("Количество чисел " + s);

    }
}

/**
 * 5. Даны положительные числа A и B (A > B). На отрезке длины A размещено максимально возможное количество
 * отрезков длины B (без наложений). Не используя операции умножения и деления, найти длину незанятой части отрезка A.
 */


class Main13 {
    public static void main(String[] args) {
        int a = 105;
        int b = 8;
        for (; a > b; a = a - b) {
        }
        System.out.println(a);
    }
}


/**
 * 6. Даны положительные числа A, B, C. На прямоугольнике размера A × B размещено максимально возможное количество
 * квадратов со стороной C (без наложений). Найти количество квадратов, размещенных на прямоугольнике.
 */

class Main14 {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        int c = 1;
        int p = a * b;
        int k = c * c;
        int x = 0;
        for (; p >= k; p = p - k) {
            x += 1;
        }
        System.out.println(x);

    }
}


/**
 * 7.
 * Дано целое число N (> 0). С помощью операций деления нацело и взятия остатка от деления: определить имеется
 * ли в записи числа N цифра «2»; найти число, полученное при прочтении числа N справа налево; найти количество и
 * сумму его цифр. Использовать можно любое количество циклов, но чем меньше, тем лучше
 */


class Main15 {    // пробный метод массивом
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner inputFigure = new Scanner(System.in);
        int n = inputFigure.nextInt();
        String s = String.valueOf(n);
        char[] strToArray = s.toCharArray();

        for (int i = 0; i < strToArray.length ;i++) {
            System.out.print(strToArray[i]);
            if (strToArray[i] == '2') {
                System.out.println("В числе есть цифра 2");
            }
        }
    }
}

class Main16 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner inputFigure = new Scanner(System.in);
        int n = inputFigure.nextInt();
        int a = 0;
        int s = 0;
        int sum = 0;
        while (n > 0) {
            int x = n % 10;
            System.out.print(x);
            n = n / 10;
            s += 1;
            if (x == 2) {
                a = x;
            }
            sum = sum + x;
        }
        System.out.println();
        if (a == 2) {
            System.out.println("есть цифра 2");
        } else {
            System.out.println("нет цифры 2");
        }
        System.out.println("Количество цифр = " + s);
        System.out.println("Сумма цифр " + sum);
    }
}



/**
 * 8. Начальный вклад в банке равен 1000 руб. Через каждый месяц размер вклада увеличивается на P
 * процентов от имеющейся суммы (P — вещественное число, 0<P< 25). По данному P определить,
 * через сколько месяцев размер вклада превысит 1100 руб., и вывести найденное количество месяцев K
 * (целое число) и итоговый размер вклада S (вещественное число).
 */

class Main17 {
    public static void main(String[] args) {
        float a = 1000;
        System.out.print("Введите процент: ");
        Scanner inputFigure = new Scanner(System.in);
        float p = inputFigure.nextInt();
        int k = 0;
        if (p > 0 && p < 25) {
            for (; a <= 1100; a = a + (a * (p / 100))) {
                k += 1;
            }
            System.out.println("Количество месяцев " + k);
            System.out.println("Итоговая сумма вклада " + a);
        }
    }
}

