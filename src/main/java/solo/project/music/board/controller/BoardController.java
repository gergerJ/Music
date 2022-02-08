package solo.project.music.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;
import solo.project.music.board.dto.BoardDto;
import solo.project.music.board.service.BoardService;

/**
 * packageName : solo.project.music.board.controller
 * fileName : BoardController
 * author : Han Young Jo
 * date : 2022-02-08
 * description : CRUD 해당 기능을 관리하는 Controller
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-07         Han Young Jo             최초 생성
 * 2022-02-07         Han Young Jo             CRUD 작동 성공
 */
@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    /**
     * 선택된 노래의 가사를 보여줌 ( SEQ 요청 받은 경우 )
     * @param seq seq
     * @param mv mv
     * @return ModelAndView
     */
    @GetMapping (value="/lyrics")
    public ModelAndView lyrics(ModelAndView mv, Long seq){
        mv.addObject("lyricsView" , boardService.findLyrics(seq));
        mv.setViewName("board/lyricsPage");
        return mv;
    }

    /**
     * 새로운 노래를 등록을 위한 입력 Page 이동
     * @param mv mv
     * @return ModelAndView
     */
    @GetMapping(value="/register")
    public ModelAndView registerPage(ModelAndView mv){
        mv.setViewName("board/registerPage");
        return mv;
    }

    /**
     * 가사 수정 Page 이동 ( SEQ 요청 받은 경우 )
     * @param seq seq
     * @param mv mv
     * @return ModelAndView
     */
    @GetMapping(value="/findMusic")
    public ModelAndView update(ModelAndView mv, Long seq){
        mv.addObject("find", boardService.findMusic(seq));
        mv.setViewName("board/updatePage");
        return mv;
    }

    /**
     * 새로운 노래를 등록 ( DTO 요청받은 경우 )
     * @param boardDto boardDto
     * @param mv mv
     * @return ModelAndView
     */
    @PostMapping(value="/registerMusic")
    public ModelAndView registerMusic(ModelAndView mv, BoardDto boardDto){
        mv.addObject("List", boardService.registerMusic(boardDto));
        mv.setViewName("redirect:/board/list");
        return mv;
    }

    /**
     * 노래 삭제 기능 ( SEQ 요청 받은 경우 )
     * @param seq seq
     * @param mv mv
     * @return ModelAndView
     */
    @PostMapping(value="/delete")
    public ModelAndView deleteMusic(ModelAndView mv, Long seq){
        mv.addObject("List", boardService.deleteMusic(seq));
        mv.setViewName("redirect:/board/list");
        return mv;
    }

    /**
     * 가사 수정 ( DTO 요청 받은 경우 )
     * @param boardDto boardDto
     * @param mv mv
     * @return ModelAndView
     */
    @PostMapping(value="/updateMusic")
    public ModelAndView updateMusic(ModelAndView mv, BoardDto boardDto){
        mv.addObject("List", boardService.updateMusic(boardDto));
        mv.setViewName("redirect:/board/list");
        return mv;
    }
}
