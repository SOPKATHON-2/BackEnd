package sopt.org.backend.controller.message.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Max;

@Getter
@AllArgsConstructor
public class MessageRequestDto {

    private final String roomName;

    @Max(100)
    private String content;

}
