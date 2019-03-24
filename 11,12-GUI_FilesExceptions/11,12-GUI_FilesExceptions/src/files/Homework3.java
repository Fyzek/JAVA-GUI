package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Homework3 {

    private static final String str = "Запись в файл";

    public static void main(String[] args) {
        try {
            File file = new File("c:\\filename.txt");

//            if (!file.exists()) file.createNewFile();

            FileWriter fw = new FileWriter(file,true);

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
