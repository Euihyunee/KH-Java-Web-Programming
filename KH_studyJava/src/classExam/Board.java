package classExam;

import java.time.LocalDateTime;

public class Board {

    // 클래스의 정의 : 웹개발 -> 게시글 사용하기 위해
    // 추상화
    String title;
    String content;
    String writer;
    int readCount;
    LocalDateTime createDate;
    boolean isDeleted;


    // 멤버의 정보를 출력하는 메서드
    // 리턴형 타입 메서드 이름() {}
    // 클래스의 기능 : 출력가능
    void print(){
        System.out.println("제목: " +title);
        System.out.println("내용: " + content);
        System.out.println("작성자: " +writer);
        System.out.println("조회수: " +readCount);
        System.out.println("작성일 : " + createDate);
        System.out.println("삭제여부: " + isDeleted);
    }
    // 메서드의 사용 : 메서드 호출 -> 메서드{} 블럭 내용이 호출됩니다.

    // 기본 생성자
    public Board() {}
}
