package TemplatePattern.Networks;

public abstract class Network {
    String username;
    String password;

    Network() {};

    public boolean post(String message) {
        if (logIn(this.username, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String username, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
