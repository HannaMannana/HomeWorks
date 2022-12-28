public class Main1 {
    public static void main(String[] args) {

        IntArray array = new IntArray(15);
        System.out.println();
        for (int i : array.sort(-1)) {
            System.out.print(i + " ");
        }

        for (int i =0; i< 100; i++) {
            array.add(i);
        }


    }
}
