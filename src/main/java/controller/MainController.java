package controller;

import service.MainService;
import view.InputView;
import view.OutputView;

public class MainController {
    private final InputView inputView;
    private final OutputView outputView;
    private final MainService mainService;

    public MainController(InputView inputView, OutputView outputView, MainService mainService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.mainService = mainService;
    }

    public void run() {

    }
}
