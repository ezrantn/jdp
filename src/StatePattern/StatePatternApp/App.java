package StatePattern.StatePatternApp;

import StatePattern.ui.Player;
import StatePattern.ui.UI;

public class App {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
