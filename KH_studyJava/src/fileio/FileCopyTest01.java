package fileio;

import java.io.*;

public class FileCopyTest01 {
    public static void main(String[] args) {

        // 파일 복사
        File source = new File("콩콩밥밥_이미지.png");
        File dest = new File("콩콩밥밥_이미지_copy.png");
        try (FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(dest)){
            int data;
            int i = 0;
            while ((data = fis.read()) != -1) {
                fos.write(data);
                i++;
            }
            System.out.println("총 회전수: " +i);
        }catch(FileNotFoundException e){
            System.out.println("파일이 존재하지 않음");
        }catch(IOException e){
            System.out.println("파일 복사 실패");
        }
    }
}
