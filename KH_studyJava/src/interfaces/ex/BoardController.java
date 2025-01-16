package interfaces.ex;

public class BoardController {
    private BoardService boardService;

    public void connect(){

    }

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }
}
