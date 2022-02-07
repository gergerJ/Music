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
    public List<BoardDto> createMusic(BoardDto boardDto){
        int result = boardMapper.createMusic(boardDto);
        return boardMapper.list(boardDto);
    }
    public int deleteMusic(Long seq){
        int result = boardMapper.deleteMusic(seq);
        return result;
    }
    public BoardDto update(Long seq){
//        BoardDto boardDto = boardMapper.update(seq);
//        log.info("seq:{}", boardDto.getSeq());
        return boardMapper.update(seq);
    }
    public List<BoardDto> updateMusic(BoardDto boardDto){
        log.info("seq:{}", boardDto.getSeq());
        int result = boardMapper.updateMusic(boardDto);
        return boardMapper.list(boardDto);
    }
}
