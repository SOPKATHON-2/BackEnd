package sopt.org.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sopt.org.backend.common.dto.ErrorType;
import sopt.org.backend.domain.room.Room;
import sopt.org.backend.exception.NotFoundException;
import sopt.org.backend.infrastructure.room.RoomRepository;

import java.util.Random;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    @Transactional
    public String createRoom() {
        Room room = new Room(createRoomName());
        roomRepository.save(room);
        return room.getName();
    }

    public int getRoomMessageNum(String roomName) {
        Room room = roomRepository.findByName(roomName)
                .orElseThrow(() -> new NotFoundException(ErrorType.NOT_FOUND_ROOM_EXCEPTION));
        return room.getMessage().size();
    }
    private String createRoomName() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 50;
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }
}
