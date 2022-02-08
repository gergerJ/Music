package solo.project.music.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import solo.project.music.board.dto.BoardDto;
import solo.project.music.board.mapper.BoardMapper;

import java.util.List;

/**
 * packageName : solo.project.music.board.service
 * fileName : BoardService
 * author : Han Young Jo
 * date : 2022-02-07
 * description : Service 기능
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-07         Han Young Jo             최초 생성
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public List<BoardDto> list(){
        return boardMapper.list();
    }

    /**
     * 노래 추가 , 결과 List Page 리턴 ( DTO 요청 받은 경우 )
     * @param boardDto boardDto
     * @return List<BoardDto>
     */
    public List<BoardDto> registerMusic(BoardDto boardDto){
        int result = boardMapper.registerMusic(boardDto);
        String resultSet = "등록 실패";
        if(result>0){
            resultSet="등록 성공";
        }
        log.info("resultSet : {}", resultSet);
        return boardMapper.list();
    }

    /**
     * 노래 삭제 , 결과 숫자(1) 리턴 ( SEQ 요청 받은 경우 )
     * @param seq seq
     * @return int
     */
    public int deleteMusic(Long seq){
        int result = boardMapper.deleteMusic(seq);
        String resultSet = "삭제 실패";
        if(result>0){
            resultSet="삭제 성공";
        }
        log.info("resultSet : {}", resultSet);
        return result;
    }

    /**
     * 수정 Page 보여주기 , 결과 해당 SEQ Page 리턴 ( SEQ 요청 받은 경우 )
     * @param seq seq
     * @return BoardDto
     */
    public BoardDto findMusic(Long seq){
        return boardMapper.findMusic(seq);
    }

    /**
     * 수정 , 결과 List Page 리턴 ( DTO 요청 받은 경우 )
     * @param boardDto boardDto
     * @return List<BoardDto>
     */
    public List<BoardDto> updateMusic(BoardDto boardDto){
        log.debug("seq:{}", boardDto.getSeq());
        int result = boardMapper.updateMusic(boardDto);
        String resultSet = "업데이트 실패";
        if(result>0){
            resultSet="업데이트 성공";
        }
        log.info("resultSet : {}", resultSet);
        return boardMapper.list();
    }

    /**
     * 해당 가사 보여주기 , 결과 BoardDto 리턴 ( SEQ 요청 받은 경우 )
     * @param seq seq
     * @return BoardDto
     */
    public BoardDto findLyrics(Long seq){
        return boardMapper.findLyrics(seq);
    }
}
