package br.com.sgq.gestorpublicitario.model.incidente;


public class Material {
	private int id;
	private String item;
	private String titulo;
	
	private String material;
	private String fornecimento;
	private String aplicacao;
	private boolean certificado;
	private String lote;
	private boolean usoClienteFinal;
	
	public Material() {
	}
	
	public Material(int id, String item, String titulo, String material, String fornecimento, String aplicacao,
			boolean certificado, String lote, boolean usoClienteFinal) {
		this.id = id;
		this.item = item;
		this.titulo = titulo;
		this.material = material;
		this.fornecimento = fornecimento;
		this.aplicacao = aplicacao;
		this.certificado = certificado;
		this.lote = lote;
		this.usoClienteFinal = usoClienteFinal;
	}
	public Material(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getFornecimento() {
		return fornecimento;
	}
	public void setFornecimento(String fornecimento) {
		this.fornecimento = fornecimento;
	}
	public String getAplicacao() {
		return aplicacao;
	}
	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}
	public boolean isCertificado() {
		return certificado;
	}
	public void setCertificado(boolean certificado) {
		this.certificado = certificado;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public boolean isUsoClienteFinal() {
		return usoClienteFinal;
	}
	public void setUsoClienteFinal(boolean usoClienteFinal) {
		this.usoClienteFinal = usoClienteFinal;
	}
	
	
}
