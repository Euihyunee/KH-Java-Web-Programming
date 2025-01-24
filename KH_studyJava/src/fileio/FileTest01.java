package fileio;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) throws IOException {

        File file = new File("text.txt");
        System.out.println("파일존재? " + file.exists());
        if(!file.exists()) {
            file.createNewFile();
            System.out.println("파일이 생성되었습니다.");
        }
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println("file name: " + file.getName());
        System.out.println("file length: " + file.length());
        System.out.println("file path: " + file.getPath());
        System.out.println("file relative path: " + file.getCanonicalPath());
        System.out.println("file absolute path: " + file.getAbsolutePath());
    }

}
