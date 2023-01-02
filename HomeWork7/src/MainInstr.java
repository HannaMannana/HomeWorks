public class MainInstr {

    public static void main(String[] args) {
        Instrument [] array = new Instrument [3];
        array[0]= new Drum(30);
        array[1] = new Tuba(15);
        array[2] = new Guiter(8);
        for (Instrument a: array){
            a.play();
        }


    }

}
