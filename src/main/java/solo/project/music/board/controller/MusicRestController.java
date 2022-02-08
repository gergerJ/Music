package solo.project.music.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import solo.project.music.board.dto.MusicDto;
import solo.project.music.board.service.MusicService;

/**
 * packageName : solo.project.music.board.controller
 * fileName : MainController
 * author : Han Young Jo
 * date : 2022-02-08
 * description : 메인 페이지 접속을 위한 Controller
 * =================================================================================
 * DATE                  AUTHOR                  NOTE
 * ---------------------------------------------------------------------------------
 * 2022-02-08         Han Young Jo             최초 생성(초기 Page를 위한 메인클래스)
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class MusicRestController {
    private final MusicService boardService;

    /**
     * 새로운 노래를 등록 ( DTO 요청받은 경우 )
     * @param musicDto boardDto
     * @param mv mv
     * @return ModelAndView
     */
    @PostMapping(value="/registerMusic")
    public ModelAndView registerMusic(ModelAndView mv, MusicDto musicDto){
        mv.addObject("List", boardService.registerMusic(musicDto));
        mv.setViewName("redirect:/board/list");
        return mv;
    }

    /**
     * 노래 삭제 기능 ( SEQ 요청 받은 경우 )
     * @param seq seq
     * @return ModelAndView
     */
    @PostMapping(value="/deleteMusic")
    public String deleteMusic(Long seq){
        return boardService.deleteMusic(seq);
    }

    /**
     * 가사 수정 ( DTO 요청 받은 경우 )
     * @param musicDto boardDto
     * @param mv mv
     * @return ModelAndView
     */
    @PostMapping(value="/updateMusic")
    public ModelAndView updateMusic(ModelAndView mv, MusicDto musicDto){
        mv.addObject("List", boardService.updateMusic(musicDto));
        mv.setViewName("redirect:/board/list");
        return mv;
    }

}
