package baseball.controller;

import baseball.model.Count;
import baseball.model.NumberBaseBall;
import baseball.service.Signal;
import baseball.util.Generator;
import baseball.view.DisplayBoard;
import camp.nextstep.edu.missionutils.Console;

public class NumberBaseBallGame {

    private boolean isGameOver = false;

    public void start() {
        NumberBaseBall answerNumberBaseBallGame = new NumberBaseBall(Generator.generate());
        System.out.println("정답 : " +
                answerNumberBaseBallGame.get(0) +
                answerNumberBaseBallGame.get(1) +
                answerNumberBaseBallGame.get(2));
        while (!isGameOver) {
            DisplayBoard.input();
            NumberBaseBall inputNumberBaseBallGame = new NumberBaseBall(Console.readLine());
            Count count = Signal.gesture(answerNumberBaseBallGame, inputNumberBaseBallGame);
            DisplayBoard.count(count);
            isGameOver = isGameOver(count);
        }
    }

    private boolean isGameOver(Count count) {
        if (count.getStrike() == 3) {
            return true;
        }
        return false;
    }
}
