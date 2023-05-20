package sopt.org.backend.controller.room.dto.response;

import lombok.Getter;

@Getter
public class GetRoomResponse {

    private int messageNum;

    public GetRoomResponse(int messageNum) {
        this.messageNum = messageNum;
    }
}
