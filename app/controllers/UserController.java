package controllers;

import models.User;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.userprofile;

public class UserController extends Controller {

    public static Result index(String username) {
        User user = new User();

        for (User u : ApplicationHelper.userList) {
            if (u.getUsername().equals(username)) {
                user = u;
            }
        }

        return ok(userprofile.render(user));
    }
}
