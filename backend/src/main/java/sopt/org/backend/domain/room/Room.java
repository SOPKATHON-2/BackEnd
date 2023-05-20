package sopt.org.backend.domain.room;


import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;
import sopt.org.backend.domain.message.Message;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Room {

    @Id
    @Column(name = "room_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "room")
    private List<Message> message;

    @Column(name = "created_at")
    @CreatedDate
    @DateTimeFormat(pattern = "yyyy.MM.dd")
    private LocalDateTime createdAt;

    @Builder
    public Room(String name) {
        this.name = name;
        createdAt = LocalDateTime.now();
    }
}
