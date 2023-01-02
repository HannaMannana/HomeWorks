public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Стич", 3);
        System.out.print(cat.getName() + " " + cat.getAge());
        cat.makeNoise();
        System.out.println();
        Dog dog = new Dog("Рекс", 5);
        System.out.print(dog.getName()+ " " + dog.getAge());
        dog.makeNoise();
        System.out.println();
        Rat rat = new Rat("Люся", 1);
        System.out.print(rat.getName()+ " " + rat.getAge());
        rat.makeNoise();

    }

}
