package solo.project.music.board.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import solo.project.music.board.dto.BoardDto;

import java.util.List;

@Mapper
public interface BoardMapper {
    //public final BoardDto boardDto;
    @Select("SELECT * FROM MUSIC")
    List<BoardDto> list(BoardDto boardDto);
}
