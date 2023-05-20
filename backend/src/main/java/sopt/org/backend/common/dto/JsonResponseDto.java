package sopt.org.backend.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@JsonInclude(Include.NON_NULL)
public class JsonResponseDto<T> {

    private final int status;
    private final String message;
    private T data;

    public static JsonResponseDto success(SuccessType success) {
        return new JsonResponseDto<>(success.getHttpStatusCode(), success.getMessage());
    }

    public static <T> JsonResponseDto<T> success(SuccessType success, T data) {
        return new JsonResponseDto<>(success.getHttpStatusCode(), success.getMessage(), data);
    }

    public static JsonResponseDto error(ErrorType error) {
        return new JsonResponseDto<>(error.getHttpStatusCode(), error.getMessage());
    }

    public static JsonResponseDto error(ErrorType error, String message) {
        return new JsonResponseDto<>(error.getHttpStatusCode(), message);
    }
}