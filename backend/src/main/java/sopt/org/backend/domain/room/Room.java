package sopt.org.backend.domain.room;


import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;
import sopt.org.backend.domain.message.Message;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Size(max = 50)
    @Column(nullable = false)
    String name;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "messageId", nullable = false)
    private Message message;

    @CreatedDate
    @DateTimeFormat(pattern = "yyyy.MM.dd")
    private LocalDateTime createdAt;

    @Builder
    public Room(String name, Message message, LocalDateTime createdAt) {
        this.name = name;
        this.message = message;
        this.createdAt = createdAt;
    }
}
