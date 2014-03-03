package controllers;

import models.Article;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.articleDetails;
import views.html.index;

import java.util.List;

public class Application extends Controller {

    public static Result index() {
        List<Article> articles = ArticleHelper.createDummyArticles();

        return ok(index.render(articles));
    }

    public static Result articleDetails(String articleId) {
        int id = Integer.parseInt(articleId);
        return ok(articleDetails.render(ArticleHelper.articleList.get(id)));
    }
}
