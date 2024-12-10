package util;

public enum ErrorMessage {
    FILE_READ_EXCEPTION("파일 읽기에 실패했습니다. 경로를 확인해주세요."),
    INVALID_INPUT_EXCEPTION("잘못된 입력입니다. 다시 입력해 주세요."),
    INVALID_INPUT_FORMAT_EXCEPTION("올바르지 않은 형식으로 입력했습니다. 다시 입력해주세요.")
    ;

    private static final String prefix = "[ERROR] ";

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return prefix + message;
    }
}
