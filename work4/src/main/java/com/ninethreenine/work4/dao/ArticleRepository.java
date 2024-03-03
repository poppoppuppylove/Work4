package com.ninethreenine.work4.dao;

import com.ninethreenine.work4.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    // 可以添加自定义的查询方法
}
