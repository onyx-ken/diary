package onyx.diary.domain;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class Diary {

    private final Long id;

    private final String title;

    private final String content;

    private final String registeredUserId;

    private final LocalDate diaryDate;

    private final LocalDateTime createDateTime;

    private final LocalDateTime updateDateTime;

    private Diary(Long id, String title,
                  String content, String registeredUserId,
                  LocalDate diaryDate, LocalDateTime createDateTime,
                  LocalDateTime updateDateTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.registeredUserId = registeredUserId;
        this.diaryDate = diaryDate;
        this.createDateTime = createDateTime;
        this.updateDateTime = updateDateTime;
    }

    public static Diary create(Long id, String title,
                        String content, String registeredUserId,
                        LocalDate diaryDate, LocalDateTime createDateTime,
                        LocalDateTime updateDateTime) {
        return new Diary(id, title, content, registeredUserId, diaryDate, createDateTime, updateDateTime);
    }

}