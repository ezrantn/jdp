package TemplatePattern.TemplatePatternApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import TemplatePattern.Networks.Facebook;
import TemplatePattern.Networks.Network;
import TemplatePattern.Networks.Twitter;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.println("Input username: ");
        String username = reader.readLine();
        System.out.println("Input password: ");
        String password = reader.readLine();
        System.out.println("Input message: ");
        String message = reader.readLine();
        System.out.println("\nChoose social network for posting message: \n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());
        if (choice == 1) {
            network = new Facebook(username, password);
        } else if (choice == 2) {
            network = new Twitter(username, password);
        }
        network.post(message);
    }
}
