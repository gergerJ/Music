package solo.project.music.board.mapper;

import org.apache.ibatis.annotations.*;
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

    @Select("SELECT * FROM MUSIC where seq = #{seq}")
    BoardDto update(Long seq);

    @Update("UPDATE MUSIC SET LYRICS=#{lyrics} where SEQ = ${seq}")
    int updateMusic(BoardDto boardDto);
}
