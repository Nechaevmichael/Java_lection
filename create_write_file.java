import java.io.FileWriter;
import java.io.IOException;
/**
 * create_write_file
 */
public class create_write_file {

    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Чтение, Вариант посимвольно. Для этого необходимо выполить import java.io.*;

    }
}