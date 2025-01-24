package fileio;

import java.io.*;

public class FileCopyTest02 {
    public static void main(String[] args) {

        File file = new File("사진1.jpg");

        try(FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("사진1_copy.jpg");) {
            byte[] buffer = new byte[1024*8];
            int readCount;
            while((readCount = fis.read(buffer)) != -1) {
                System.out.println("read byte count: " + readCount);
                fos.write(buffer, 0, readCount);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일의 경로가 다르거나 존재하지 않아요");
        } catch (IOException e) {
            System.out.println("파일 복사 실패");
        }
        System.out.println("파일 복사 완료");
    }
}
