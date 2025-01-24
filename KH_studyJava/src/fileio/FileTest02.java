package fileio;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File file = new File("../test01.txt");
        if(!file.exists()){
            file.createNewFile();
            System.out.println("new file created");
        }
        System.out.println(file.getPath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getCanonicalFile());
    }
}
