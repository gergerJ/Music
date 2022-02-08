package solo.project.music.board.mapper;

import org.apache.ibatis.annotations.*;
import solo.project.music.board.dto.MusicDto;

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
public interface MusicMapper {
    @Select("SELECT * FROM music")
    List<MusicDto> list();

    @Insert("INSERT INTO music(music_name, lyrics, artist, release_date, genre) VALUES(#{music_name}, #{lyrics}, #{artist},current_date(),#{genre})")
    int registerMusic(MusicDto musicDto);

    @Delete("DELETE FROM music WHERE seq = #{seq}")
    int deleteMusic(Long seq);

    @Select("SELECT * FROM music WHERE seq = #{seq}")
    MusicDto findMusic(Long seq);

    @Update("UPDATE music SET lyrics= #{lyrics} WHERE seq = #{seq}")
    int updateMusic(MusicDto musicDto);

    @Select("SELECT * FROM music WHERE seq = #{seq}")
    MusicDto findLyrics(Long seq);
}
