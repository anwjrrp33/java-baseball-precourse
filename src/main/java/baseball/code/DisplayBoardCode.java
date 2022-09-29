package baseball.code;

public enum DisplayBoardCode {

    BALL("볼"),

    STRIKE("스트라이크"),

    NOTHING("낫싱"),

    INPUT("숫자를 입력해주세요 : ");

    private String message;

    DisplayBoardCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
