package solo.project.music.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import solo.project.music.board.dto.MusicDto;
import solo.project.music.board.mapper.MusicMapper;

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
public class MusicService {
    private final MusicMapper boardMapper;

    public List<MusicDto> list(){
        return boardMapper.list();
    }

    /**
     * 노래 추가 , 결과 List Page 리턴 ( DTO 요청 받은 경우 )
     * @param musicDto boardDto
     * @return List<BoardDto>
     */
    public String registerMusic(MusicDto musicDto){
        int result = boardMapper.registerMusic(musicDto);
        String resultSet = "Music 등록 실패";
        if(result>0){
            resultSet = "Music 등록 성공";
        }
        log.info("[ MusicService > registerMusic Result: {}]", resultSet);
        return resultSet;
    }

    /**
     * 노래 삭제 , 결과 숫자(1) 리턴 ( SEQ 요청 받은 경우 )
     * @param seq seq
     * @return int
     */
    public String deleteMusic(Long seq){
        int result = boardMapper.deleteMusic(seq);
        String resultSet = "Music 삭제 실패";
        if(result>0){
            resultSet="Music 삭제 성공";
        }
        log.info("[ MusicService > deleteMusic Result: {}]", resultSet);
        return resultSet;
    }

    /**
     * 수정 Page 보여주기 , 결과 해당 SEQ Page 리턴 ( SEQ 요청 받은 경우 )
     * @param seq seq
     * @return BoardDto
     */
    public MusicDto findMusic(Long seq){
        return boardMapper.findMusic(seq);
    }

    /**
     * 수정 , 결과 List Page 리턴 ( DTO 요청 받은 경우 )
     * @param musicDto boardDto
     * @return List<BoardDto>
     */
    public List<MusicDto> updateMusic(MusicDto musicDto){
        int result = boardMapper.updateMusic(musicDto);
        String resultSet = "업데이트 실패";
        if(result>0){
            resultSet="업데이트 성공";
        }
        log.info("[ MusicService > updateMusic Result: {}]", resultSet);
        return boardMapper.list();
    }

    /**
     * 해당 가사 보여주기 , 결과 BoardDto 리턴 ( SEQ 요청 받은 경우 )
     * @param seq seq
     * @return BoardDto
     */
    public MusicDto findLyrics(Long seq){
        return boardMapper.findLyrics(seq);
    }
}
