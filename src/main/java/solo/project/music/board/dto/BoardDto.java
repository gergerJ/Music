package solo.project.music.board.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

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
