package sopt.org.backend.controller.room.dto.response;

import lombok.Getter;

@Getter
public class PostRoomResponse {

    String roomName;

    public PostRoomResponse(String roomName) {
        this.roomName = roomName;
    }
}
