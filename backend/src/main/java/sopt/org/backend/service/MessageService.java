package sopt.org.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.backend.controller.message.dto.request.MessageRequestDto;
import sopt.org.backend.domain.message.Message;
import sopt.org.backend.domain.room.Room;
import sopt.org.backend.infrastructure.message.MessageRepository;
import sopt.org.backend.infrastructure.room.RoomRepository;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;
    private final RoomRepository roomRepository;
    // 메시지를 쓴다 create
    @Transactional
    public void create(MessageRequestDto messageRequestDto){

        Room room = roomRepository.findByName(messageRequestDto.getRoom_Name())
                .orElseThrow();

        messageRepository.save(Message.builder()
                .room(room)
                .content(messageRequestDto.getContent())
                .build());
    }


}
