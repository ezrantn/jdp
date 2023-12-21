package ChainOfResponsibilityPattern.COR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import ChainOfResponsibilityPattern.middleware.Middleware;
import ChainOfResponsibilityPattern.middleware.RoleCheckMiddleware;
import ChainOfResponsibilityPattern.middleware.ThrottlingMiddleware;
import ChainOfResponsibilityPattern.middleware.UserExistMiddleware;
import ChainOfResponsibilityPattern.server.Server;

public class ChainOfResponsibilityApp {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistMiddleware(server),
                new RoleCheckMiddleware()
        );
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
            do {
                System.out.println("Enter email: ");
                String email = reader.readLine();
                System.out.println("Input password: ");
                String password = reader.readLine();
                success = server.login(email, password);
            } while (!success);
    }
}

