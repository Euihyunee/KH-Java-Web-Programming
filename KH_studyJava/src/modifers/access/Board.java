package modifers.access;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// 클래스의 접근 제어자로 public, package(Default)
public class Board {
    private long no; // 동일 클래스 내에서만 접근가능
    // 👆이는 getter/setter를 통해 접근 가능하다.
    String title;
    protected String content; // 동일 패키지 또는 상속
    public int readCount; // 어디서든 가능
    // Inner 클래스(멤버 클래스)의 경우 4가지 접근제어자 가능하다.
    private class Inner{}
    protected class Inner2{}

}
// pakage(Default) : 명시하면 에러 - 생략되어 있으면
// 허용하는 범위가 동일 package 내에서 허용가능
class Board2{}
