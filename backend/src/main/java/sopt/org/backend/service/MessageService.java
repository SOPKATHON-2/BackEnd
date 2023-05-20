package sopt.org.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.backend.controller.message.dto.request.MessageRequestDto;
import sopt.org.backend.controller.message.dto.response.MessageResponseDto;
import sopt.org.backend.domain.message.Message;
import sopt.org.backend.domain.room.Room;
import sopt.org.backend.infrastructure.message.MessageRepository;
import sopt.org.backend.infrastructure.room.RoomRepository;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.lang.reflect.Member;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;
    private final RoomRepository roomRepository;
    // 메시지를 쓴다 create
    @Transactional
    public void create(MessageRequestDto messageRequestDto){

        messageRepository.save(Message.builder()
                .roomId(messageRequestDto.getRoom_id())
                .content(messageRequestDto.getContent())
                .createAt(LocalDateTime.now())
                .build());
    }
}
