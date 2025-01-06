package classExam;

import java.time.LocalDateTime;

public class BoardTest01 {
    public static void main(String[] args) {
        Board board = new Board();

        System.out.println("제목: " + board.title);
        System.out.println("내용: " + board.content);
        System.out.println("작성자: " + board.writer);
        System.out.println("조회수: " + board.readCount);
        System.out.println("작성일 : " + board.createDate);
        System.out.println("삭제여부: " + board.isDeleted);
        System.out.println("-----------------------");

        board.title = "제목테스트";
        board.content = "내용테스트";
        board.writer = "writer test";
        board.isDeleted = false;
        board.readCount = 30;
        board.createDate = LocalDateTime.now();

        board.print();
    }
}
