package com.receitex.receitex.models;

import java.io.Serializable;
import java.util.List;

public class ReceitaModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String titulo;
	private String image;
	private String tempoPreparo;
	private String rendimento;
	private List<String> igredientes;
	private List<String> modoPreparo;
	
	public ReceitaModel() {
		// TODO Auto-generated constructor stub
	}
	
	public ReceitaModel(String titulo, String image, String tempoPreparo, String rendimento, List<String> igredientes,
			List<String> modoPreparo) {
		super();
		this.titulo = titulo;
		this.image = image;
		this.tempoPreparo = tempoPreparo;
		this.rendimento = rendimento;
		this.igredientes = igredientes;
		this.modoPreparo = modoPreparo;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTempoPreparo() {
		return tempoPreparo;
	}
	public void setTempoPreparo(String tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}
	public String getRendimento() {
		return rendimento;
	}
	public void setRendimento(String rendimento) {
		this.rendimento = rendimento;
	}
	public List<String> getIgredientes() {
		return igredientes;
	}
	public void setIgredientes(List<String> igredientes) {
		this.igredientes = igredientes;
	}
	public List<String> getModoPreparo() {
		return modoPreparo;
	}
	public void setModoPreparo(List<String> modoPreparo) {
		this.modoPreparo = modoPreparo;
	}
	

	
	
}
