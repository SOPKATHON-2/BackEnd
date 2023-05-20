package sopt.org.backend.controller.message.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MessageRequestDto {

    private final Long room_id;

    private String content;

}
