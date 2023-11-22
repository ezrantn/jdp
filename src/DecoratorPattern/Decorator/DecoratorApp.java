package DecoratorPattern.Decorator;

import DecoratorPattern.Decorators.*;

public class DecoratorApp {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJonathan Santosa, 102000\nStieven Johanson, 102000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("OutputDemo.txt")
                )
        );

        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input =================");
        System.out.println(salaryRecords);
        System.out.println("- Encoded ==================");
        System.out.println(plain.readData());
        System.out.println("- Decoded ==================");
        System.out.println(encoded.readData());
    }
}
