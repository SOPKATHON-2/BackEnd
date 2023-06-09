package sopt.org.backend.common.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ErrorType {

    /**
     * 400 BAD REQUEST
     */
    REQUEST_HEADER_TOKEN_EXCEPTION(HttpStatus.BAD_REQUEST, "잘못된 헤더 토큰 값입니다."),

    /**
     * 404 NOT FOUND
     */

    NOT_FOUND_ROOM_EXCEPTION(HttpStatus.NOT_FOUND, "해당 방을 찾을 수 없습니다"),

    /**
     * 500 INTERNAL SERVER ERROR
     */
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "예상치 못한 서버 에러가 발생하였습니다."),

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
