package baseball.view;

import baseball.code.DisplayBoardCode;
import baseball.model.Count;

public class DisplayBoard {

    public static void input() {
        System.out.print(DisplayBoardCode.INPUT.getMessage());
    }

    public static void count(Count count) {
        if(!count.isNothing()) {
            resultCount(count);
            return;
        }
        System.out.println(DisplayBoardCode.NOTHING.getMessage());
    }

    private static void resultCount(Count count) {
        StringBuilder st = new StringBuilder();
        st.append(zeroCheck(count.getBall(), DisplayBoardCode.BALL.getMessage()));
        st.append(st.length() > 0 ? " " : "");
        st.append(zeroCheck(count.getStrike(), DisplayBoardCode.STRIKE.getMessage()));
        System.out.println(st);
    }

    private static String zeroCheck(int count, String message) {
        if(count > 0) {
            return count + message;
        }
        return "";
    }
}
