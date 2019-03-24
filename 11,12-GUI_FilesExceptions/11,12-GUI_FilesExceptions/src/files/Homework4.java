package files;

import java.io.File;
import java.io.FilenameFilter;

public class Homework4 {

    public static void main(String[] args) {
        File dir = new File("C:\\test\\");

        FilenameFilter customFilter = new CustomFileFilter("txt");

        System.out.println("Файлы с расширением *.txt:");
        for (String fileName : dir.list(customFilter)) {
            System.out.println(fileName);
        }
    }
}


