package sopt.org.backend.controller.message;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.backend.common.dto.JsonResponseDto;
import sopt.org.backend.common.dto.SuccessType;
import sopt.org.backend.controller.message.dto.request.MessageRequestDto;
import sopt.org.backend.service.MessageService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/message")
@RequiredArgsConstructor
@CrossOrigin("*")
public class MessageController {

    private final MessageService messageService;

    @PostMapping
    public JsonResponseDto postMessage(@RequestBody @Valid MessageRequestDto messageRequestDto){
        messageService.create(messageRequestDto);
        return JsonResponseDto.success(SuccessType.CREATE_MESSAGE_SUCCESS);

    }
}
