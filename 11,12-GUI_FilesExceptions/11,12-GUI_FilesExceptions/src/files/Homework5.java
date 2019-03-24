package files;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashSet;

// дополнительная задача - упорядочить результат вывода

public class Homework5 {

    public static void main(String[] args) {

        File dir = new File("C:\\Windows");

        HashSet<String> extList = new HashSet<>(); // будет хранить все найденные в папке расширения файлов

        for (String fileName : dir.list()) {

            File file = new File(dir.getAbsolutePath() + "\\" + fileName);

            int i = fileName.lastIndexOf(".");
            if (file.isFile() && i != -1) {// если это не папка и в имени файла есть точка (т.е. есть расширение файла)
                extList.add(fileName.substring(i + 1, fileName.length()).toLowerCase());// добавляется расширение файла
            }
        }
        
        System.out.println("Статистика по расширениям файлов для папки "+dir.getAbsolutePath()+" :");
        
        // можно было использовать итератор
        for (String ext : extList) {
            FilenameFilter filter = new CustomFileFilter(ext);// для каждого расширения создаем фильтр для фильтрации файлов внутри папки
            System.out.println("." + ext + ": "+dir.listFiles(filter).length);// вывести статистику по каждому расширению
        }
        
    }// end main

}
