package sopt.org.backend.infrastructure.room;

import org.springframework.data.jpa.repository.JpaRepository;
import sopt.org.backend.domain.room.Room;

import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {

    Optional<Room> findByName(String name);
}
