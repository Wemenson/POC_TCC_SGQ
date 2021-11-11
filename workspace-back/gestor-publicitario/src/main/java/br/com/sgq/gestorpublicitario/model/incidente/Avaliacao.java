package br.com.sgq.gestorpublicitario.model.incidente;

public class Avaliacao {
	private int id;
	private String descricao;
	
	public Avaliacao() {
	}
	
	public Avaliacao(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	public Avaliacao(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
