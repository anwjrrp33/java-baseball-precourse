package baseball.code;

public enum DisplayBoardCode {

    INPUT("숫자를 입력해주세요 : ");

    private String message;

    DisplayBoardCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
