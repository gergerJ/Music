package solo.project.music.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import solo.project.music.board.dto.BoardDto;
import solo.project.music.board.service.BoardService;

@Controller
@Slf4j
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping(value="/board/list")
    public ModelAndView list(ModelAndView mv, BoardDto boardDto){
        mv.addObject("List", boardService.list(boardDto));
        mv.setViewName("board/list.html");
        return mv;
    }
    // 가사 연동 시키키

    //곡 추가 기능! Insert
    @PostMapping(value="/board/create")
    public ModelAndView createMusic(ModelAndView mv){
        mv.setViewName("board/createMusic.html");
        return mv;
    }
    //곡 삭제 기능!  => 곡 삭제

    //곡 수정 기능! => 가사 오타 수정
}
