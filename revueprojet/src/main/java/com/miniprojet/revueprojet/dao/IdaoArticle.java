package com.miniprojet.revueprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniprojet.revueprojet.entities.Article;

public interface IdaoArticle extends JpaRepository<Article, Long>{
	void ajouterArticle();
}
