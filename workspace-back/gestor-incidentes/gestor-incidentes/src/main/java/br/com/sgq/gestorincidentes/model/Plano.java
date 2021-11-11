package br.com.sgq.gestorincidentes.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="planoacao")
public class Plano {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String imediato;
	@Column
	private String definitivo;
	@Column
	private Date dataacaoimediata;
	@Column
	private Date dataacaoefetiva;
	@Column
	private String justificativa;
	@Column
	private boolean notificacaoexterna; 
	@Column
	private boolean notificacaojuridica;	
	@Column
	private boolean notficacaopubli;
	
	public Plano() {
	}
	
	public Plano(int id, String imediato, String definitivo, Date dataacaoimediata, Date dataacaoefetiva,
			String justificativa, boolean notificacaoexterna, boolean notificacaojuridica, boolean notficacaopubli) {
		this.id = id;
		this.imediato = imediato;
		this.definitivo = definitivo;
		this.dataacaoimediata = dataacaoimediata;
		this.dataacaoefetiva = dataacaoefetiva;
		this.justificativa = justificativa;
		this.notificacaoexterna = notificacaoexterna;
		this.notificacaojuridica = notificacaojuridica;
		this.notficacaopubli = notficacaopubli;
	}
	public Plano(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImediato() {
		return imediato;
	}
	public void setImediato(String imediato) {
		this.imediato = imediato;
	}
	public String getDefinitivo() {
		return definitivo;
	}
	public void setDefinitivo(String definitivo) {
		this.definitivo = definitivo;
	}
	public Date getDataacaoimediata() {
		return dataacaoimediata;
	}
	public void setDataacaoimediata(Date dataacaoimediata) {
		this.dataacaoimediata = dataacaoimediata;
	}
	public Date getDataacaoefetiva() {
		return dataacaoefetiva;
	}
	public void setDataacaoefetiva(Date dataacaoefetiva) {
		this.dataacaoefetiva = dataacaoefetiva;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	public boolean isNotificacaoexterna() {
		return notificacaoexterna;
	}
	public void setNotificacaoexterna(boolean notificacaoexterna) {
		this.notificacaoexterna = notificacaoexterna;
	}
	public boolean isNotificacaojuridica() {
		return notificacaojuridica;
	}
	public void setNotificacaojuridica(boolean notificacaojuridica) {
		this.notificacaojuridica = notificacaojuridica;
	}
	public boolean isNotficacaopubli() {
		return notficacaopubli;
	}
	public void setNotficacaopubli(boolean notficacaopubli) {
		this.notficacaopubli = notficacaopubli;
	}
	
	
}
