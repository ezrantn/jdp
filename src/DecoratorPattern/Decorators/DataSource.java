package DecoratorPattern.Decorators;

public interface DataSource {
    void writeData(String data);
    String readData();
}
