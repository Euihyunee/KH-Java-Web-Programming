package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest02 {
    public static void main(String[] args) {

        String fileName = "test001.txt";

        try(BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter(fileName))){

            bufferedWriter.write("안녕!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
