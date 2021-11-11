package br.com.sgq.gestorpublicitario.model.incidente;
public class Criticidade {
	private int id;
	private String descricao;

	public Criticidade() {
	}
	
	public Criticidade(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	public Criticidade(int id) {
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
