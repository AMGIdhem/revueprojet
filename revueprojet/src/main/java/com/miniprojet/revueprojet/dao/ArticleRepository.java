package com.miniprojet.revueprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniprojet.revueprojet.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
