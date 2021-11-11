package br.com.sgq.gestorincidentes.form;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.sgq.gestorincidentes.model.Autor;
import br.com.sgq.gestorincidentes.model.Avaliacao;
import br.com.sgq.gestorincidentes.model.Criticidade;
import br.com.sgq.gestorincidentes.model.Incidente;
import br.com.sgq.gestorincidentes.model.Material;
import br.com.sgq.gestorincidentes.model.Plano;
import br.com.sgq.gestorincidentes.model.Processo;

@JsonFormat
public class IncidenteForm {
	
	private String titulo;
	private String descricao;
	private String descricaoCenario;	
	private LocalDateTime dataAtualizacao;
	private int versao;
	private int tipoAvaliacao;
	private int criticidadeIncidente;
	private int processo;
	private int material;
	private int autor;
	private int planoAcao;
	
	public IncidenteForm() {
	}
	
	public Incidente registrarNovoIncidente() {
		Incidente incidente = new Incidente();
		incidente.setTitulo(titulo);
		incidente.setDescricao(descricao);
		incidente.setCenario(descricaoCenario);
		incidente.setDataregistro(LocalDateTime.now());
		incidente.setDataatualizacao((dataAtualizacao==null || dataAtualizacao.equals(null)) ? LocalDateTime.now() : dataAtualizacao);
		incidente.setVersao((versao==0) ? 1 : versao);
		incidente.setTpavaliacao(new Avaliacao(tipoAvaliacao));
		incidente.setInccriticidade(new Criticidade(criticidadeIncidente));
		incidente.setArprocesso(new Processo(processo));
		incidente.setMaterial(new Material(material));
		incidente.setIncautor(new Autor(autor));
		incidente.setPlanoacao(new Plano(planoAcao));
		return incidente;
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


	public String getDescricaoCenario() {
		return descricaoCenario;
	}


	public void setDescricaoCenario(String descricaoCenario) {
		this.descricaoCenario = descricaoCenario;
	}


	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}


	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}


	public int getVersao() {
		return versao;
	}


	public void setVersao(int versao) {
		this.versao = versao;
	}


	public int getTipoAvaliacao() {
		return tipoAvaliacao;
	}


	public void setTipoAvaliacao(int tipoAvaliacao) {
		this.tipoAvaliacao = tipoAvaliacao;
	}


	public int getCriticidadeIncidente() {
		return criticidadeIncidente;
	}


	public void setCriticidadeIncidente(int criticidadeIncidente) {
		this.criticidadeIncidente = criticidadeIncidente;
	}


	public int getProcesso() {
		return processo;
	}


	public void setProcesso(int processo) {
		this.processo = processo;
	}


	public int getMaterial() {
		return material;
	}


	public void setMaterial(int material) {
		this.material = material;
	}


	public int getAutor() {
		return autor;
	}


	public void setAutor(int autor) {
		this.autor = autor;
	}


	public int getPlanoAcao() {
		return planoAcao;
	}


	public void setPlanoAcao(int planoAcao) {
		this.planoAcao = planoAcao;
	}
	
	
	
	
}
