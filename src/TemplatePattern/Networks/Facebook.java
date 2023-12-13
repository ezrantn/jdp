package TemplatePattern.Networks;

public class Facebook extends Network {
    public Facebook(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    boolean logIn(String username, String password) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + this.username);
        System.out.println("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.println("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogin success on Facebook");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: " + new String(data) + " 'was posted on Facebook'");
            return true;
        } else {
            return false;
        }
    }

    @Override
    void logOut() {
        System.out.println("User: " + username + " 'was logged out from Facebook'");
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 0) {
                System.out.println(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
