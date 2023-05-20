package sopt.org.backend.controller.message.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MessageRequestDto {

    private final String room_Name;

    private String content;

}
