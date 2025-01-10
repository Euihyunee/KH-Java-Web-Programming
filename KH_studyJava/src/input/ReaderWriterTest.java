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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Post post = new Post();
        System.out.print("타이틀 입력: ");
        post.title = br.readLine();
        System.out.print("내용 입력: ");
        post.content = br.readLine();
        br.close();
        System.out.println("title: " + post.title);
        System.out.println("content: " + post.content);
    }
}
