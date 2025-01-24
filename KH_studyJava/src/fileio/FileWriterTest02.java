package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest02 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("data.dat", true)) {
            System.out.print("이름> ");
            String name = in.nextLine();
            System.out.print("전화번호> ");
            String phone = in.nextLine();
            String str = String.format("%s %s\n", name, phone);
            fw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
