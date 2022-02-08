package solo.project.music.board.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;


/**
 * packageName : solo.project.music.board.dto
 * fileName : BoardDto
 * author : Han Young Jo
 * date : 2022-02-07
 * description : Board의 Dto 기능
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-07         Han Young Jo             최초 생성
 */
@Getter
@Setter
//@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BoardDto {
    private Long seq;
    private String music_name;
    private String lyrics;
    private String artist;
    private Date release_date;
    private String genre;
}
