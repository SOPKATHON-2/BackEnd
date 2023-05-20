package sopt.org.backend.domain.message;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;
import sopt.org.backend.domain.room.Room;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Message {

    @Id
    @Column(name = "message_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @Column
    private String content;

    @Column(name = "created_at")
    @CreatedDate
    @DateTimeFormat(pattern = "yyyy.MM.dd")
    private LocalDateTime createdAt;

    @Builder
    public Message(Room room, String content, LocalDateTime createAt) {
        this.room = room.getId().longValue();
        this.content = content;
        this.createdAt = createdAt;
    }
}
