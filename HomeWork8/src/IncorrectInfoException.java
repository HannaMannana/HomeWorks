public class IncorrectInfoException extends Exception {
    int age;
    String name;

    public IncorrectInfoException(int age) {
        this.age = age;
    }

    public IncorrectInfoException(String name) {
        this.name = name;
    }
}
