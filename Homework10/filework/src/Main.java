import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        File dir = new File("C:\\Users\\Lenovo\\IdeaProjects\\Lessons\\HomeWorks\\Homework10\\OurCatalog");

        String way = "C:\\Users\\Lenovo\\IdeaProjects\\Lessons\\HomeWorks\\Homework10\\OurCatalog\\result.txt";
        String newText = "";

        if (dir.isDirectory()) {
            for (File item: dir.listFiles()) {

                try (FileReader reader = new FileReader(item.toString())) {
                    char[] buf = new char[256];
                    int c = reader.read(buf);

                    if (c > 0) {
                        buf = Arrays.copyOf(buf, c);
                    }

                    String text = String.valueOf(buf);
                    newText += text+"\s";
                } catch (IOException ex) {
                    System.out.println("Не удалось прочесть");
                }
            }
        }


        File newFile = new File(way);
        try {
            boolean created = newFile.createNewFile();
            if (created) {

                try (FileWriter text = new FileWriter(way)) {
                text.write(newText);
                    System.out.println("Новый документ: " + newText);
                } catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
       }
    }
}