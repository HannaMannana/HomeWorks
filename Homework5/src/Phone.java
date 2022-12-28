public class Phone {

   int number;
   String model;
   int weight;




//   public Phone (int number, String model, int weight) {
//      number = number;
//      model = model;
//      weight = weight;
//   }

   public Phone (int number, String model) {
      this.number = number;
      this.model = model;
   }

   public Phone () {

   }

   public Phone (int number, String model, int weight) {
      this(number, model);
      this.weight = weight;
   }


   int getNumber() {
      return number;
   }


     String receiveCall(String name) {
      return "Звонит " + name;
   }

    public void receiveCall(String name, int number) {
      System.out.println("Звонит " + name + " " + number);
   }

   public void sendMessage(int ...numbers){

      for (int n : numbers){
         System.out.println(n);
      }
   }


}
