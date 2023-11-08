package AbstractFactoryPattern.Buttons;

public class WindowsButton implements Buttons {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
