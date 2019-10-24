package app.servlets;

import app.entities.User;
import app.service.CRUDService;
import app.service.UserService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Objects;

public class UserServlet extends HttpServlet {

    /*private CRUDService<User> userService;

    public UserServlet() {
        userService = new UserService();
    }*/

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder builder = new StringBuilder();

        try(BufferedReader reader = req.getReader()) {

            String line = "";

        /*while ((line = reader.readLine()) != null) {
            builder.append(line).append("\n");
        }*/

            while (Objects.nonNull(line)) {
                builder.append(line).append("\n");
                line = reader.readLine();
            }
        }

        Gson gson = new Gson();

        User user = gson.fromJson(builder.toString(), User.class);

        new UserService().save(user);

    }
}
