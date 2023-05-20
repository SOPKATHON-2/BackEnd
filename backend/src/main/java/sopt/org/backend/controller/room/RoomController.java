package sopt.org.backend.controller.room;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.backend.common.dto.JsonResponse;
import sopt.org.backend.common.dto.SuccessType;
import sopt.org.backend.controller.room.dto.response.GetRoomResponse;
import sopt.org.backend.controller.room.dto.response.PostRoomResponse;
import sopt.org.backend.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @PostMapping("")
    public JsonResponse postRoom() {
        PostRoomResponse response = new PostRoomResponse(roomService.createRoom());
        return JsonResponse.success(SuccessType.CREATE_ROOM_SUCCESS, response);
    }

    @GetMapping
    public JsonResponse getRoom(@RequestParam String roomName) {
        GetRoomResponse response = new GetRoomResponse(roomService.getRoomMessageNum(roomName));
        return JsonResponse.success(SuccessType.READ_ROOM_MESSAGE_NUM_SUCCESS, response);
    }
}
