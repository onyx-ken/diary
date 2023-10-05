package onyx.diary.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import onyx.diary.domain.Diary;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "DIARY")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DiaryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private String registeredUserId;

    private LocalDate diaryDate;

    private LocalDateTime createDateTime;

    private LocalDateTime updateDateTime;

    public static Diary toDomain(DiaryEntity diaryEntity) {
        return Diary.create(diaryEntity.getId(), diaryEntity.getTitle(),
                diaryEntity.getContent(), diaryEntity.getRegisteredUserId(),
                diaryEntity.getDiaryDate(), diaryEntity.getCreateDateTime(),
                diaryEntity.getUpdateDateTime());
    }
}