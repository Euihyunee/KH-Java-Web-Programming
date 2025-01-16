package interfaces.ex;

public class BoardServiceProcess implements BoardService{
    @Override
    public void save(BoardDTO boardDTO) {
        System.out.println("글을 저장합니다.");
    }
}
