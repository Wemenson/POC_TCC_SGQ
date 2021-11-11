package br.com.sgq.gestorpublicitario.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.sgq.gestorpublicitario.model.incidente.Incidente;
import br.com.sgq.gestorpublicitario.model.incidente.Plano;

public class CampanhaIncidente {
	private String dataacao;
	private String cenario;
	private String justificativa;
	private String planoacao;
	private String abrangenciacampanha;
	private List<String> listprodutos;
	private boolean campanhaencerrada;
	
	public CampanhaIncidente() {
		
	}
	
	public CampanhaIncidente(String dataacao, String cenario, String justificativa, String planoacao,
		String abrangenciacampanha, List<String> listprodutos, boolean campanhaencerrada) {
		this.dataacao = dataacao;
		this.cenario = cenario;
		this.justificativa = justificativa;
		this.planoacao = planoacao;
		this.abrangenciacampanha = abrangenciacampanha;
		this.listprodutos = listprodutos;
		this.campanhaencerrada = campanhaencerrada;
	}

	public List<CampanhaIncidente> listarCampanhas(List<Incidente> incidentes){
		List<CampanhaIncidente> lista = new ArrayList<CampanhaIncidente>();
		for(Incidente incidente : incidentes) {
		List<String> chassi = new ArrayList<String>();
		int i=0;
		while(i<=5) {
			int random_int = (int)Math.floor(Math.random()*(10000-1000+1)+1000);
			chassi.add("CHASSMT"+random_int);
			i++;
		}

			Plano plano = incidente.getPlanoacao();
			Date dataAtual = new Date();
			campanhaencerrada = !plano.getDataacaoefetiva().after(dataAtual);
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
			lista.add(new CampanhaIncidente(
					formatter.format(plano.getDataacaoefetiva()), 
					incidente.getCenario(), 
					plano.getJustificativa(), 
					plano.getDefinitivo(), 
					"Todos clientes que possuem o produto instalado em seus veiculos", 
					chassi,
					campanhaencerrada));
		}
		return lista;
	}
	
	
	public String getDataacao() {
		return dataacao;
	}
	
	public void setDataacao(String dataacao) {
		this.dataacao = dataacao;
	}
	public String getCenario() {
		return cenario;
	}
	public void setCenario(String cenario) {
		this.cenario = cenario;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	public String getPlanoacao() {
		return planoacao;
	}
	public void setPlanoacao(String planoacao) {
		this.planoacao = planoacao;
	}
	public String getAbrangenciacampanha() {
		return abrangenciacampanha;
	}
	public void setAbrangenciacampanha(String abrangenciacampanha) {
		this.abrangenciacampanha = abrangenciacampanha;
	}
	public List<String> getListprodutos() {
		return listprodutos;
	}
	public void setListprodutos(List<String> listprodutos) {
		this.listprodutos = listprodutos;
	}

	public boolean isCampanhaencerrada() {
		return campanhaencerrada;
	}

	public void setCampanhaencerrada(boolean campanhaencerrada) {
		this.campanhaencerrada = campanhaencerrada;
	}
	
	
}
