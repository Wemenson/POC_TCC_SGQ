package br.com.sgq.gestorincidentes.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="arprocesso")
public class Processo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "idprocesso")
	private String processo;
	@Column
	private Date dtexecucao;
	@OneToOne
	@JoinColumn(name = "executor")
	private Autor executor;
	@Column
	private String etapa;
	@Column
	private String modoavaliacao;
	@Column
	private String sistemaorigem;
	
	public Processo() {
	}
	
	public Processo(int id, String processo, Date dtexecucao, Autor executor, String etapa, String modoavaliacao,
			String sistemaorigem) {
		this.id = id;
		this.processo = processo;
		this.dtexecucao = dtexecucao;
		this.executor = executor;
		this.etapa = etapa;
		this.modoavaliacao = modoavaliacao;
		this.sistemaorigem = sistemaorigem;
	}
	public Processo(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProcesso() {
		return processo;
	}
	public void setProcesso(String processo) {
		this.processo = processo;
	}
	public Date getDtexecucao() {
		return dtexecucao;
	}
	public void setDtexecucao(Date dtexecucao) {
		this.dtexecucao = dtexecucao;
	}
	public Autor getExecutor() {
		return executor;
	}
	public void setExecutor(Autor executor) {
		this.executor = executor;
	}
	public String getEtapa() {
		return etapa;
	}
	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}
	public String getModoavaliacao() {
		return modoavaliacao;
	}
	public void setModoavaliacao(String modoavaliacao) {
		this.modoavaliacao = modoavaliacao;
	}
	public String getSistemaorigem() {
		return sistemaorigem;
	}
	public void setSistemaorigem(String sistemaorigem) {
		this.sistemaorigem = sistemaorigem;
	}
	
	
}
