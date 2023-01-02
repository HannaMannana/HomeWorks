public class Guiter implements Instrument{
    int numberStrings;

    public  Guiter (int numberStrings){
        this.numberStrings = numberStrings;
    }

    @Override
    public void play(){
        System.out.println("Играет гитара, c кол. струн " + numberStrings);
    }
}
