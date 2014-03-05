package controllers.common;

import models.User;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.userprofile;

public class AuthController extends Controller {

    public static Result auth() {
        DynamicForm requestData = Form.form().bindFromRequest();
        String firstname = requestData.get("firstname");
        String lastname = requestData.get("lastname");
        return ok(userprofile.render(new User()));
    }
}