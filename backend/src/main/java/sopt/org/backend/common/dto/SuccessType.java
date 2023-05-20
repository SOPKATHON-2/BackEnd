package sopt.org.backend.common.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum SuccessType {
    /**
     * 200 OK
     */
    READ_ROOM_MESSAGE_NUM_SUCCESS(HttpStatus.OK, "메세지 개수 조회가 성공했습니다."),

    /**
     * 201 CREATED
     */
    CREATE_MESSAGE_SUCCESS(HttpStatus.OK, "메시지 생성되었습니다."),
    CREATE_ROOM_SUCCESS(HttpStatus.CREATED, "방이 생성되었습니다."),
    ;

    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }

    public String getMessage() {
        return message;
    }
}
