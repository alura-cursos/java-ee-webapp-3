package br.com.casadocodigo.loja.models;

import javax.json.Json;
import javax.json.JsonObjectBuilder;

public class Promo {

	private String titulo;
	private Livro livro = new Livro();

	public String toJson() {
		JsonObjectBuilder promo = Json.createObjectBuilder();
		promo.add("titulo", titulo)
			.add("livroId", livro.getId());
		
		return promo.build().toString();
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
