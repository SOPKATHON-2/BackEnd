package sopt.org.backend.exception;

import sopt.org.backend.common.dto.ErrorType;

public class BadRequestException extends ApiException {

    public BadRequestException(ErrorType error) {
        super(error);
    }
}
