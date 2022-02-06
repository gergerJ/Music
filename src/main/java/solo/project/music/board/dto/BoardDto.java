package solo.project.music.board.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class BoardDto {
    private Long seq;
    private String music_name;
    private String lyrics;
    private String artist;
    private Date release_date;
    private String genre;
}
