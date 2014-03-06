package controllers.common;

import models.User;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.userprofile;

public class AuthController extends Controller {

    private User usermodel = new User();

    public static Result auth() {
        DynamicForm requestData = Form.form().bindFromRequest();
        String email = requestData.get("email");
        String password = requestData.get("password");

        // do authentication

        // redirect to index page with valid session for user
        return ok(userprofile.render(new User()));
    }
}