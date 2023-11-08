package FactoryPattern.App;

import FactoryPattern.Factory.DIalog;
import FactoryPattern.Factory.HtmlDialog;
import FactoryPattern.Factory.WindowsDialog;

public class FactoryPatternApp {
    private static DIalog dIalog;
    public static void main(String[] args) {
        configure();
        runBussinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 11")) {
            dIalog = new WindowsDialog();
        } else {
            dIalog = new HtmlDialog();
        }
    }

    static void runBussinessLogic() {
        dIalog.renderWindow();
    }
}
