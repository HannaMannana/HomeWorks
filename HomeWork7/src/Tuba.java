public class Tuba implements Instrument {
    int diameter;

    public  Tuba (int diameter){
        this.diameter = diameter;
    }

    @Override
    public void play(){
        System.out.println("Играет туба, с диаметром " + diameter);
    }
}
