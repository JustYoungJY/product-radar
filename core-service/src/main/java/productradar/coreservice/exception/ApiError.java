package productradar.coreservice.exception;

public record ApiError(
        String message,
        int status
) {
}
