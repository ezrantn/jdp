package SingletonPattern.Data;

public final class finalSingleton {
    private static finalSingleton instance;
    public String value;

    private finalSingleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }


    public static finalSingleton getInstance(String value) {
        if (instance == null) {
            instance = new finalSingleton(value);
        }
        return instance;
    }
}
