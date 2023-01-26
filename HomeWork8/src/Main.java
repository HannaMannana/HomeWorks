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

 class Main10 {
    public static void main(String[] args) {
        StringBuilder strB = createSomeString(3, 56);
        System.out.println(strB);

        modifySomeString(strB);
        System.out.println(strB);

        modifySomeStringForAll(strB,"+","плюс");
        System.out.println(strB);


    }

    public static StringBuilder createSomeString(int a, int b){
        StringBuilder str = new StringBuilder();
        str.append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n")
                .append(a).append(" - ").append(b).append(" = ").append(a-b).append("\n")
                .append(a).append(" * ").append(b).append(" = ").append(a*b).append("\n");
        return str;
    }
    public static StringBuilder modifySomeString(StringBuilder stringBuilder){
        int i;
        while ((i=stringBuilder.indexOf("=")) != -1){
            stringBuilder.replace(i,i+1, " равно");
        }
        return stringBuilder;
    }

     public static StringBuilder modifySomeStringForAll(StringBuilder stringBuilder, String oldString, String newString){
         int i;
         while ((i=stringBuilder.indexOf(oldString)) != -1){
             stringBuilder.replace(i,i+1, (newString));
         }
         return stringBuilder;
     }

    }
