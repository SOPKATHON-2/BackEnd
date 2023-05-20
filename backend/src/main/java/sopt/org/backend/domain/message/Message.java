package sopt.org.backend.domain.message;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;
import sopt.org.backend.domain.room.Room;

import javax.persistence.*;
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

    @Column(name = "create_at")
    @CreatedDate
    @DateTimeFormat(pattern = "yyyy.MM.dd")
    private Date createAt;

    @Builder
    public Message(Room room, String content, Date createAt) {
        this.room = room;
        this.content = content;
        this.createAt = createAt;
    }
}
