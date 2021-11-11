package br.com.sgq.gestorpublicitario.model.incidente;

import java.util.Date;
public class Plano {
	private int id;
	private String imediato;
	private String definitivo;
	private Date dataacaoimediata;
	private Date dataacaoefetiva;
	private String justificativa;
	private boolean notificacaoexterna; 
	private boolean notificacaojuridica;	
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
