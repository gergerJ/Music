package solo.project.music.board.mapper;

import org.apache.ibatis.annotations.*;
import solo.project.music.board.dto.BoardDto;

import java.util.List;

@Mapper
public interface BoardMapper {
    //public final BoardDto boardDto;
    @Select("SELECT * FROM music")
    List<BoardDto> list();

    @Insert("INSERT INTO music(music_name, lyrics, artist, release_date, genre) VALUES(#{music_name}, #{lyrics}, #{artist},current_date(),#{genre})")
    int createMusic(BoardDto boardDto);

    @Delete("DELETE FROM music WHERE seq= #{seq}")
    int deleteMusic(Long seq);

    @Select("SELECT * FROM music WHERE seq = #{seq}")
    BoardDto update(Long seq);

    @Update("UPDATE music SET LYRICS= #{lyrics} WHERE seq = #{seq}")
    int updateMusic(BoardDto boardDto);

    @Select("SELECT * FROM music WHERE seq = #{seq}")
    BoardDto lyrics(Long seq);
}
