package controllers;

import models.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleHelper {

    public static List<Article> articleList = new ArrayList<>();

    public static List<Article> createDummyArticles() {
        for (int i = 0; i < 10; i++) {
            Article article = new Article("Heading " + i, "Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.");
            if (i%3 != 0) {
                article.setAvailable(true);
            }
            article.setId(i);
            articleList.add(article);
        }

        return articleList;
    }

}
