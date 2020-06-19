package com.receitex.receitex.controllers;


import org.apache.tomcat.util.json.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.receitex.receitex.models.ReceitaModel;
import com.receitex.receitex.repository.ReceitasRepository;


@RequestMapping("/")
@RestController
public class ReceitaControler {

	ReceitasRepository receitaRepository = new ReceitasRepository();
	
	
	@GetMapping("/{text}")
	public ResponseEntity<ReceitaModel> findByText(@PathVariable String text){
		try {
			
			return ResponseEntity.ok().body(receitaRepository.getReceita(text));
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}
	
}
