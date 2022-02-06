package solo.project.music.board.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import solo.project.music.board.dto.BoardDto;

import java.util.List;

@Mapper
public interface BoardMapper {
    //public final BoardDto boardDto;
    @Select("SELECT * FROM MUSIC")
    List<BoardDto> list(BoardDto boardDto);

    @Insert("INSERT INTO MUSIC(music_name, LYRICS, ARTIST, RELEASE_DATE, GENRE) VALUES(#{music_name}, #{lyrics}, #{artist},current_date(),#{genre})")
    int createMusic(BoardDto boardDto);

    @Delete("DELETE FROM MUSIC WHERE SEQ= #{seq}")
    int deleteMusic(Long seq);
}
