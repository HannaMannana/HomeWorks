public class Main {
    public static void main(String[] args) {

        Phone a = new Phone(111111,"samsung", 3);
        System.out.println("Номер тел.:" + a.number + " Модель: "+ a.model + " Вес: " + a.weight);

        Phone b = new Phone(222222,"iPhone", 2);
        System.out.println("Номер тел.:" + b.number + " Модель: "+ b.model + " Вес: " + b.weight);

        Phone c = new Phone(333333,"LG", 4);
        System.out.println("Номер тел.:" + c.number + " Модель: "+ c.model + " Вес: " + c.weight);

        System.out.println(a.getNumber());
        System.out.println(b.getNumber());
        System.out.println(c.getNumber());
        System.out.println(a.receiveCall("Аня"));
        System.out.println(a.receiveCall("Катя"));
        System.out.println(a.receiveCall("Паша"));
        a.receiveCall("Аня", 111111);
        a.receiveCall("Катя", 222222);
        a.receiveCall("Паша", 333333);
        a.sendMessage(111222, 222333, 333444, 555666);
    }
}