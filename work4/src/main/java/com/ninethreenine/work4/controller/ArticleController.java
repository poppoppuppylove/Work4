package com.ninethreenine.work4.controller;

import com.ninethreenine.work4.entity.Article;
import com.ninethreenine.work4.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {
    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    // 获取所有文章按点击量降序排列
    @GetMapping("/articles")
    public List<Article> getAllArticlesOrderByLikesDesc() {
        return articleService.getAllArticlesOrderByLikesDesc();
    }

    // 添加新文章
    @PostMapping("/articles")
    public Article addArticle(@RequestBody Article article) {
        return articleService.addArticle(article);
    }
}
