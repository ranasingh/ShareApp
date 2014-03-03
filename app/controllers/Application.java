package controllers;

import models.Article;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {

    public static Result index() {
        List<Article> articles = createDummyArticles();

        return ok(index.render(articles));
    }

    private static List<Article> createDummyArticles() {
        List<Article> dummyList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            dummyList.add(new Article("Heading", "Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui."));
        }

        return dummyList;
    }

}
