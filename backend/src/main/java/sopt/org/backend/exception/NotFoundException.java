package sopt.org.backend.exception;

import sopt.org.backend.common.dto.ErrorType;

public class NotFoundException extends ApiException {

    public NotFoundException(ErrorType error) {
        super(error);
    }
}
