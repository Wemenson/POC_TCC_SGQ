package br.com.sgq.gestorpublicitario.model.incidente;

import java.time.LocalDateTime;

public class Incidente {
   private Long id;
   private String titulo;
   private String descricao;
   private String cenario;
   private LocalDateTime dataregistro;
   private LocalDateTime dataatualizacao;
   private int versao; 
   private boolean resultadosatisfatorio;
   
   private Avaliacao tpavaliacao;

   private Criticidade inccriticidade;
   
   private Processo arprocesso;
   
   private Material material;
   
   private Autor incautor;
   
   private Plano planoacao;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getCenario() {
		return cenario;
	}
	
	public void setCenario(String cenario) {
		this.cenario = cenario;
	}
	
	public LocalDateTime getDataregistro() {
		return dataregistro;
	}
	
	public void setDataregistro(LocalDateTime localDateTime) {
		this.dataregistro = localDateTime;
	}
	
	public LocalDateTime getDataatualizacao() {
		return dataatualizacao;
	}
	
	public void setDataatualizacao(LocalDateTime localDateTime) {
		this.dataatualizacao = localDateTime;
	}
	
	public int getVersao() {
		return versao;
	}
	
	
	public boolean isResultadosatisfatorio() {
		return resultadosatisfatorio;
	}

	public void setResultadosatisfatorio(boolean resultadosatisfatorio) {
		this.resultadosatisfatorio = resultadosatisfatorio;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}
	
	public Avaliacao getTpavaliacao() {
		return tpavaliacao;
	}
	
	public void setTpavaliacao(Avaliacao tpavaliacao) {
		this.tpavaliacao = tpavaliacao;
	}
	
	public Criticidade getInccriticidade() {
		return inccriticidade;
	}
	
	public void setInccriticidade(Criticidade inccriticidade) {
		this.inccriticidade = inccriticidade;
	}
	
	public Processo getArprocesso() {
		return arprocesso;
	}
	
	public void setArprocesso(Processo arprocesso) {
		this.arprocesso = arprocesso;
	}
	
	public Material getMaterial() {
		return material;
	}
	
	public void setMaterial(Material material) {
		this.material = material;
	}
	
	public Autor getIncautor() {
		return incautor;
	}
	
	public void setIncautor(Autor incautor) {
		this.incautor = incautor;
	}
	
	public Plano getPlanoacao() {
		return planoacao;
	}
	
	public void setPlanoacao(Plano planoacao) {
		this.planoacao = planoacao;
	}
   
}
