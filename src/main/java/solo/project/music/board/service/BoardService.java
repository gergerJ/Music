package solo.project.music.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import solo.project.music.board.dto.BoardDto;
import solo.project.music.board.mapper.BoardMapper;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

//    public BoardService(BoardMapper boardMapper){
//        this.boardMapper = boardMapper;
//    }
    public List<BoardDto> list(){
        return boardMapper.list();
    }
    public List<BoardDto> createMusic(BoardDto boardDto){
        int result = boardMapper.createMusic(boardDto);
        String resultSet = "등록 실패";
        if(result>0){
            resultSet="등록 성공";
        }
        log.info("resultSet : {}", resultSet);
        return boardMapper.list();
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
        String resultSet = "업데이트 실패";
        if(result>0){
            resultSet="업데이트 성공";
        }
        log.info("resultSet : {}", resultSet);
        return boardMapper.list();
    }
    public BoardDto lyrics(Long seq){
        return boardMapper.lyrics(seq);
    }
}
