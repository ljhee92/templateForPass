import config.AppConfig;
import controller.MainController;

public class Application {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MainController mainController = appConfig.controller();
        mainController.run();
    }
}