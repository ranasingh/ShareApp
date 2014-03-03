package controllers;

import models.Article;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class ApplicationHelper {

    public static final List<Article> articleList = createDummyArticles();
    public static final List<User> userList = createListOfAppUsers();

    public static List<Article> createDummyArticles() {
        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Article article = new Article("Heading " + i, "Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.");
            if (i%3 != 0) {
                article.setAvailable(true);
            }
            article.setId(i);
            articles.add(article);
        }

        return articles;
    }

    public static List<Article> createArticlesOwnedByUser() {
        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Article article = new Article("Heading " + i, "Eksempeltekst, jeg eier denne artikkelen.");
            if (i%3 != 0) {
                article.setAvailable(true);
            }
            article.setId(i);
            articles.add(article);
        }

        return articles;
    }

    public static List<User> createListOfAppUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("ranjitis", "Rana", "Singh"));
        users.add(new User("fredpett", "Fredrik", "Pettersen"));
        users.add(new User("son", "Aran", "Singh"));
        return users;
    }

}
