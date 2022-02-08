package solo.project.music.board.mapper;

import org.apache.ibatis.annotations.*;
import solo.project.music.board.dto.BoardDto;

import java.util.List;

/**
 * packageName : solo.project.music.board.mapper
 * fileName : BoardMapper
 * author : Han Young Jo
 * date : 2022-02-07
 * description : Board의 Sql문 기능
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-07         Han Young Jo             최초 생성
 */
@Mapper
public interface BoardMapper {
    @Select("SELECT * FROM music")
    List<BoardDto> list();

    @Insert("INSERT INTO music(music_name, lyrics, artist, release_date, genre) VALUES(#{music_name}, #{lyrics}, #{artist},current_date(),#{genre})")
    int registerMusic(BoardDto boardDto);

    @Delete("DELETE FROM music WHERE seq = #{seq}")
    int deleteMusic(Long seq);

    @Select("SELECT * FROM music WHERE seq = #{seq}")
    BoardDto findMusic(Long seq);

    @Update("UPDATE music SET lyrics= #{lyrics} WHERE seq = #{seq}")
    int updateMusic(BoardDto boardDto);

    @Select("SELECT * FROM music WHERE seq = #{seq}")
    BoardDto findLyrics(Long seq);
}
