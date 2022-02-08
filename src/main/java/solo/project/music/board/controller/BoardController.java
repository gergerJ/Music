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

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping(value="/list")
    public ModelAndView list(ModelAndView mv){
        mv.addObject("List", boardService.list());
        mv.setViewName("board/list");
        return mv;
    }
    // 가사 보이게 하는 창! 추가
    @GetMapping (value="/lyrics")
    public ModelAndView lyrics(ModelAndView mv, Long seq){
        mv.addObject("lyricsView" , boardService.lyrics(seq));
        mv.setViewName("board/lyricsPage");
        return mv;
    }
    //곡 추가를 위한 창 띄우기 부분
    @GetMapping(value="/create")
    public ModelAndView createMusic(ModelAndView mv){
        mv.setViewName("board/createMusic");
        return mv;
    }
    //곡 추가 기능! Insert
    @PostMapping(value="/createMusicList")
    public ModelAndView createMusicList(ModelAndView mv, BoardDto boardDto){
        mv.addObject("List", boardService.createMusic(boardDto));
        mv.setViewName("redirect:/board/list");
        return mv;
    }
    //곡 삭제 기능!  => 곡 삭제   // 이해가 잘 안감!
    @PostMapping(value="/delete")
    public ModelAndView deleteMusic(ModelAndView mv, Long seq){
        mv.addObject("List", boardService.deleteMusic(seq));
        mv.setViewName("redirect:/board/list");
        return mv;
    }
    //수정 창 띄우기
    @PostMapping(value="/update")
    public ModelAndView update(ModelAndView mv, Long seq){
        mv.addObject("update", boardService.update(seq));
        mv.setViewName("board/updatePage");
        return mv;
    }
    //실제 수정부분 구현
    @PostMapping(value="/updateMusicList")
    public ModelAndView updateMusic(ModelAndView mv, BoardDto boardDto){
        mv.addObject("List", boardService.updateMusic(boardDto));
        mv.setViewName("redirect:/board/list");
        return mv;
    }
}
