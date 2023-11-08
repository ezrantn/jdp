package AbstractFactoryPattern.Buttons;

public class MacOSButton implements Buttons {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
