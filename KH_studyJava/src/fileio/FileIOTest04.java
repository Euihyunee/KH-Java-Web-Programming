package fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOTest04 {
    public static void main(String[] args) {
        String fileName = "./test01.dat";

        try(FileReader fr = new FileReader(fileName)){
            char[] buffer = new char[1024];
            int readCount = fr.read(buffer);
            System.out.println(readCount);
            System.out.println(new String(buffer, 0, readCount));

        }catch (FileNotFoundException e){
            System.out.println("파일이 존재하지 않아요.");
        }catch(IOException e){
            System.out.println("파일을 읽지 못했습니다.");
        }
    }
}
