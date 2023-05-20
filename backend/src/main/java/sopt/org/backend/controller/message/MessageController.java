package sopt.org.backend.controller.message;



import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sopt.org.backend.common.dto.JsonResponseDto;
import sopt.org.backend.common.dto.SuccessType;
import sopt.org.backend.controller.message.dto.request.MessageRequestDto;
import sopt.org.backend.service.MessageService;

import java.util.List;

@RestController
@RequestMapping("/api/message")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @PostMapping("/")
    public ResponseEntity<JsonResponseDto> getAccountsList(
            @RequestBody MessageRequestDto messageRequestDto

    ) {
        messageService.create(messageRequestDto);
        return ResponseEntity.ok(JsonResponseDto.success(SuccessType.MESSAGE_SUCCESS));

    }
}

