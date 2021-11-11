package br.com.sgq.gestorpublicitario.model.incidente;


public class Autor {
	private int id;
	private String nome;
	private String funcao;
	private String setor;
	private String unidade;
	
	public Autor() {
	}
	
	public Autor(int id, String nome, String funcao, String setor, String unidade) {
		this.id = id;
		this.nome = nome;
		this.funcao = funcao;
		this.setor = setor;
		this.unidade = unidade;
	}
	public Autor(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	
}
