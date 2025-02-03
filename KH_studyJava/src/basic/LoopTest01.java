package basic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Board implements Serializable {
    private String title;
    private String content;

    public Board() {
    }
    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public String toString() {
        return "제목: " + title + ", 내용: " + content;
    }
    public void save(String fileName){
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fos)) {
            out.writeObject(this);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class LoopTest01 {
    public static void main(String[] args) {

        Board board = new Board("안녕하세요", "반갑습니다.");
        String fileName = "serializeTest.txt";

        board.save(fileName);

    }
}
