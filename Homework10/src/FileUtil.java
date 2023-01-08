import java.io.*;
        import java.util.ArrayList;
        import java.util.Arrays;

public class FileUtil {

    static boolean saveReadersList(ArrayList<Reader> readers) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\Lessons\\HomeWorks\\Homework10\\file.txt"))) {

            oos.writeUnshared(readers);

        } catch (Exception ex) {
            System.out.println("Запись не получилась");
        }
        return false;
    }

    static public ArrayList<Reader> restoreReadersList() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\Lessons\\HomeWorks\\Homework10\\file.txt"))) {

            ArrayList<Reader> readers = (ArrayList<Reader>) ois.readObject();
            return readers;
        } catch (Exception ex) {
            System.out.println("Не получилось прочесть");
            return new ArrayList<Reader>();
        }
    }
}

