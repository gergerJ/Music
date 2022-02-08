package solo.project.music.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import solo.project.music.board.service.BoardService;

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
@Controller
@RequiredArgsConstructor
public class MainController {
    private final BoardService boardService;

    /**
     * 초기 Index Page 보여주는 기능
     * @param mv mv
     * @return ModelAndView
     */
    @GetMapping(value={"/board/list", "", "/"})
    public ModelAndView list(ModelAndView mv){
        mv.addObject("List", boardService.list());
        mv.setViewName("board/list");
        return mv;
    }
}
