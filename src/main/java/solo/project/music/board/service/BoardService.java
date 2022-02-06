package solo.project.music.board.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import solo.project.music.board.dto.BoardDto;
import solo.project.music.board.mapper.BoardMapper;

import java.util.List;

@Service
@Slf4j
public class BoardService {
    private final BoardMapper boardMapper;

    public BoardService(BoardMapper boardMapper){
        this.boardMapper = boardMapper;
    }
    public List<BoardDto> list(BoardDto boardDto){
        return boardMapper.list(boardDto);
    }
}
