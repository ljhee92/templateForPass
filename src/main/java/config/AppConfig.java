package config;

import controller.Controller;
import view.InputView;
import view.OutputView;

public class AppConfig {
    public Controller controller() {
        return new Controller(inputView(), outputView());
    }

    private InputView inputView() {
        return new InputView();
    }

    private OutputView outputView() {
        return new OutputView();
    }
}
