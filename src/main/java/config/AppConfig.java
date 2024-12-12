package config;

import controller.MainController;
import service.MainService;
import view.InputView;
import view.OutputView;

public class AppConfig {
    public MainController controller() {
        return new MainController(inputView(), outputView(), mainService());
    }

    private InputView inputView() {
        return new InputView();
    }

    private OutputView outputView() {
        return new OutputView();
    }

    private MainService mainService() {
        return new MainService();
    }
}
