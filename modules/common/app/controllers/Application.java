package controllers.common;

import models.Article;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;


import java.util.List;

public class Application extends Controller {

    static Form<Article> articleForm = Form.form(Article.class);

    public static Result index() {
        return ok(index.render(Article.find.all()));
    }

    public static Result articleDetails(String articleId) {
        return ok(articleDetails.render(Article.find.byId(Long.parseLong(articleId))));
    }

    public static Result newArticlePage() {
        return ok(newArticle.render(articleForm));
    }

    public static Result newArticle() {
        Form<Article> filledForm = articleForm.bindFromRequest();
        if (filledForm.hasErrors()) {
            return badRequest(newArticle.render(filledForm));
        } else {
            Article.create(filledForm.get());
            return redirect(controllers.common.routes.UserController.index("ranjitis"));
        }
    }
}