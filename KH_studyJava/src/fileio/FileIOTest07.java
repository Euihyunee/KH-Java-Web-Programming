package fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class FileIOTest07 {
    public static void main(String[] args) {
        String fileName = "./test01.dat";
        CharBuffer buffer = CharBuffer.allocate(1024);
        try(FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);) {
            int readCount;
            while((readCount=fr.read(buffer))!=-1) {
                buffer.flip(); // 읽기 모드로 전환
                while (buffer.hasRemaining()) {
                    System.out.print(buffer.get()); // 버퍼에서 문자 읽기
                }
                buffer.clear(); // 버퍼를 비우고 쓰기 모드로 전환
            }
        }catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없음");
        }catch (IOException e) {
            System.out.println("파일을 읽을 수 없음");
        }
    }
}
