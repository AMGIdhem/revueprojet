package com.miniprojet.revueprojet.service;

import org.springframework.stereotype.Service;

import com.miniprojet.revueprojet.entities.Article;
@Service
public interface ArticleService {
	public Article addArticle(Article article);
}
