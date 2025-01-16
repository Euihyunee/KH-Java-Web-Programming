package interfaces.ex;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {

    private long no;
    private String title;
    private String content;
    private String writer;
    private int readCount;
}
