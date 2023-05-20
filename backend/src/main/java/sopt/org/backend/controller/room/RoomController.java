package sopt.org.backend.controller.room;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sopt.org.backend.service.RoomService;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

}
