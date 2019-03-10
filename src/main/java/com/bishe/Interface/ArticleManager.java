package com.bishe.Interface;

import com.bishe.Http.Response;
import com.bishe.model.Article;

import java.util.List;

public interface ArticleManager {

    Response pushArticle(Article article);

    Article getArticle(int articleId);

    List<Article> getArticleListByUserId(int userid);

    Response editArticle(int articleId);
}
