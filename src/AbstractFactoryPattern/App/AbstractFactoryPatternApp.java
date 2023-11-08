package AbstractFactoryPattern.App;

import AbstractFactoryPattern.Application.Application;
import AbstractFactoryPattern.Factories.GUIFactory;
import AbstractFactoryPattern.Factories.MacOSFactory;
import AbstractFactoryPattern.Factories.WindowsFactory;

public class AbstractFactoryPatternApp {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
