package sopt.org.backend.exception;

import sopt.org.backend.common.dto.ErrorType;

public class ApiException extends RuntimeException {
    private final ErrorType error;

    public ApiException(ErrorType error) {
        super(error.getMessage());
        this.error = error;
    }

    public int getHttpStatus() {
        return this.error.getHttpStatusCode();
    }

    public ErrorType getError() {
        return this.error;
    }
}
