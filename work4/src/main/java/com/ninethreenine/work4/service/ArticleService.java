package com.ninethreenine.work4.service;

import com.ninethreenine.work4.dao.ArticleRepository;
import com.ninethreenine.work4.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    // 添加新文章
    public Article addArticle(Article article) {
        return articleRepository.save(article);
    }

    // 获取所有文章按点击量降序排列
    public List<Article> getAllArticlesOrderByLikesDesc() {
        return articleRepository.findAllByOrderByLikesDesc();
    }
}
