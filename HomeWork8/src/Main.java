public class Main {
    public static void main(String[] args) {

        StringBuilder strBuilder = new StringBuilder("3 + 56 = 59");
        strBuilder.append(" \n3 - 56 = -53");
        strBuilder.append(" \n3 * 56 = 168");
        System.out.println(strBuilder);

        for (int i = 0; i < strBuilder.length(); i++) {
            if (strBuilder.charAt(i) == '=') {
                strBuilder.replace(i, i + 1, "равно");
            }
        }

        System.out.println(strBuilder.toString());
    }
}

// 1. Составляем строку с помощью класса StringBuilder
//Дано два числа, например 3 и 56, необходимо составить следующие строки:
//3 + 56 = 59
//3 – 56 = -53
//3 * 56 = 168.
//Используем метод StringBuilder.append().
//Замените символ “=” на слово “равно”. Используйте метод StringBuilder.replace()