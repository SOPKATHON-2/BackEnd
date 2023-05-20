package sopt.org.backend.infrastructure.message;

import org.springframework.data.jpa.repository.JpaRepository;
import sopt.org.backend.domain.message.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
