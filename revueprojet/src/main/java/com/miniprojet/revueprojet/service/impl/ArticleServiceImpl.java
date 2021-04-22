package com.miniprojet.revueprojet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.miniprojet.revueprojet.dao.ArticleRepository;
import com.miniprojet.revueprojet.entities.Article;
import com.miniprojet.revueprojet.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {
	@Autowired
	ArticleRepository articleRepository;
	
	public Article addArticle(Article article) {
		Article theArticle = articleRepository.save(article);
		return theArticle;
	}

	
}
