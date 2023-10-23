package baseball.controller;

import baseball.model.Computer;
import baseball.model.User;
import baseball.view.InputView;
import java.util.List;

public class Service {
    Computer computer = new Computer();
    User user = new User();
    InputView inputView = new InputView();
    int ball;
    int strike;
    List<Integer> computerNumbers;
    List<Integer> userNumbers;

    public void initializeGame() {
        computer.setNumbers();
        computerNumbers = computer.getNumbers();
    }

    public List<Integer> getUserInput(String input) {
        user.setNumbers(input);
        return user.getNumbers();
    }
}
