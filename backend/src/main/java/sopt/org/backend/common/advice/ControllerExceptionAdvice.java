package sopt.org.backend.common.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import sopt.org.backend.common.dto.ErrorType;
import sopt.org.backend.common.dto.JsonResponseDto;
import sopt.org.backend.exception.ApiException;
import sopt.org.backend.exception.BadRequestException;
import sopt.org.backend.exception.NotFoundException;

import java.nio.file.InvalidPathException;
import java.util.Objects;

@RestControllerAdvice
public class ControllerExceptionAdvice {

    /**
     * 400 BAD_REQUEST
     */

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected JsonResponseDto handleMethodArgumentNotValidException(final MethodArgumentNotValidException e) {
        System.out.println("ControllerExceptionAdvice.handleMethodArgumentNotValidException");
        FieldError fieldError = Objects.requireNonNull(e.getFieldError());
        return JsonResponseDto.error(ErrorType.REQUEST_HEADER_TOKEN_EXCEPTION,
                String.format("%s. (%s)", fieldError.getDefaultMessage(), fieldError.getField()));
    }


//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ExceptionHandler(BadRequestException.class)
//    protected JsonResponseDto handleMethodUrlValidException(final BadRequestException e) {
//        System.out.println("ControllerExceptionAdvice.handleMethodUrlValidException");
////        FieldError fieldError = Objects.requireNonNull(e.getFieldError());
//        return JsonResponseDto.error(ErrorType.NOT_FOUND_ROOM_EXCEPTION);
//    }

    /**
     * 500 Internal Server
     */

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    protected JsonResponseDto<Object> handleException(final Exception e) {
        System.out.println("ControllerExceptionAdvice.handleException");
        return JsonResponseDto.error(ErrorType.INTERNAL_SERVER_ERROR);
    }

    /**
     * api custom error
     */

    @ExceptionHandler(ApiException.class)
    protected ResponseEntity<JsonResponseDto> handleCustomException(ApiException e) {
        System.out.println("ControllerExceptionAdvice.handleCustomException");
        return ResponseEntity.status(e.getHttpStatus())
                .body(JsonResponseDto.error(e.getError()));
    }
}
