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
public class JsonResponse<T> {

    private final int status;
    private final String message;
    private T data;

    public static JsonResponse success(SuccessType success) {
        return new JsonResponse<>(success.getHttpStatusCode(), success.getMessage());
    }

    public static <T> JsonResponse<T> success(SuccessType success, T data) {
        return new JsonResponse<>(success.getHttpStatusCode(), success.getMessage(), data);
    }

    public static JsonResponse error(ErrorType error) {
        return new JsonResponse<>(error.getHttpStatusCode(), error.getMessage());
    }

    public static JsonResponse error(ErrorType error, String message) {
        return new JsonResponse<>(error.getHttpStatusCode(), message);
    }
}