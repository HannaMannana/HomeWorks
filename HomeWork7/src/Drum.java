public class Drum implements Instrument {
    int size;

    public  Drum(int size){
      this.size = size;
    }

    @Override
    public void play(){
        System.out.println("Играет барабан, размером " + size);
    }
}
