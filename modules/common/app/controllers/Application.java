package controllers.common;

import models.Article;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.articleDetails;
import views.html.index;


import java.util.List;

public class Application extends Controller {

    public static Result index() {
        List<Article> articles = Article.find.all();

        return ok(index.render(articles));
    }

    public static Result articleDetails(String articleId) {
        Long id = Long.parseLong(articleId);
        return ok(articleDetails.render(Article.find.byId(id)));
    }
}
