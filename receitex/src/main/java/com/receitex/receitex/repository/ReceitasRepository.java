package com.receitex.receitex.repository;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.http.ResponseEntity;

import com.receitex.receitex.models.ReceitaModel;

public class ReceitasRepository {

	
	public ReceitaModel getReceita(String text) {
		try {
			Document doc = Jsoup.connect("https://www.tudogostoso.com.br/busca?q=" + text).get();
			Element firstPost = doc.getElementsByClass("m-0").first();
			doc = Jsoup.connect("https://www.tudogostoso.com.br" +firstPost.attr("href")).get();
			System.out.println(doc.getElementsByClass("ul").eachText());
			return new ReceitaModel(
					doc.getElementsByTag("h1").first().text(),
					doc.getElementsByTag("picture").first().getElementsByTag("img").first().attr("src"),
					doc.getElementsByClass("dt-duration").first().text(),
					doc.getElementsByClass("p-yield").first().text(),
					doc.getElementsByClass("ingredients-card").first().getElementsByTag("li").eachText(),
					doc.getElementsByClass("instructions").first().getElementsByTag("li").eachText()
					);
		} catch (Exception e) {
			System.out.println("errror");
		}
		return new ReceitaModel();
	}
}

