package interfaces.ex;

public interface BoardService {
    // 글쓰기 기능: 게시글 내용을 DB 저장
    public void save(BoardDTO boardDTO);
}
