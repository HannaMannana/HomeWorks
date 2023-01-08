import java.io.Serializable;

public class Book implements Serializable {

    String name;
    String authorName;
    String text;


    Book (){

    }

    String infoBook () {
        String volume = name + " " + authorName;
        return volume;
    }


}
