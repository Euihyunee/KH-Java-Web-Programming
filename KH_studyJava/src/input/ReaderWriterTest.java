package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Post{
    String title;
    String content;
}

public class ReaderWriterTest {
    public static void main(String[] args) throws IOException {

        // 알고리즘 관련 처리-성능 고려
        // Scanner 대신 BufferdReader
        // 문자 단위 Stream
        // InputStreamReader isr;
        // 버스와 관련있음

        // InputStreamReader는 추상 Reader를 상속받음
        // BufferedReader 생성자에는 Reader(System.in) 필요

        Post post = new Post();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("제목 입력: ");
            post.title = br.readLine();
            System.out.print("내용 입력: ");
            post.content = br.readLine();
        } catch (Exception e) {
            System.out.println("입력장치가 정확하지 않음!");
        }

        System.out.println("title: " + post.title);
        System.out.println("content: " + post.content);
        System.out.print("타이틀 입력: ");
    }
}
