package br.com.sgq.gestorincidentes.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Incidente {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column
   private String titulo;
   @Column
   private String descricao;
   @Column
   private String cenario;
   @Column
   private LocalDateTime dataregistro;
   @Column
   private LocalDateTime dataatualizacao;
   @Column
   private int versao; 
   @Column
   private boolean resultadosatisfatorio;
   
   
   @ManyToOne
   @JoinColumn(name = "tpavaliacao")
   private Avaliacao tpavaliacao;

   @ManyToOne
   @JoinColumn(name = "inccriticidade")
   private Criticidade inccriticidade;
   
   @ManyToOne
   @JoinColumn(name = "arprocesso")
   private Processo arprocesso;
   
   @ManyToOne
   @JoinColumn(name = "material")
   private Material material;
   
   @ManyToOne
   @JoinColumn(name = "incautor")
   private Autor incautor;
   
   @ManyToOne
   @JoinColumn(name = "planoacao")
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
