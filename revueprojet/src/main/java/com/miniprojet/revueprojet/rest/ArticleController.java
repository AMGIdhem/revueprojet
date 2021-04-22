package com.miniprojet.revueprojet.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miniprojet.revueprojet.entities.Article;
import com.miniprojet.revueprojet.service.ArticleService;

@RestController("/article")
public class ArticleController {
	@Autowired
	ArticleService articleService;
	
	@PostMapping
	public Article addArticle(@RequestBody Article theArticle) {
		Article article = articleService.addArticle(theArticle);
		return article;
	}
}
