package br.com.sgq.gestorincidentes.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.sgq.gestorincidentes.model.Incidente;
import br.com.sgq.gestorincidentes.model.Plano;

@Component
@JsonFormat
public class IncidenteDto {
	@JsonAlias(value="id")
	private Long id;
	@JsonAlias(value="titulo-incidente")
	private String titulo;
	@JsonAlias(value="data-atualizacao")
	private LocalDateTime dataAtualizacao;
	@JsonAlias(value="status-incidentes")
	private String status;
	@JsonAlias(value="versao")
	private int versao;
	
	public IncidenteDto() {
	}
	
	public IncidenteDto(Incidente incidente) {
		this.id = incidente.getId();
		this.titulo = incidente.getTitulo();
		this.dataAtualizacao = incidente.getDataatualizacao();
		this.status = getStatusIncidente(incidente.isResultadosatisfatorio());
		this.versao = incidente.getVersao();
	}
	
	public List<IncidenteDto> listIncidentes(List<Incidente> incidentes) {
		List<IncidenteDto> incidenteDto = new ArrayList<IncidenteDto>();
		for(Incidente incidente : incidentes){
			incidenteDto.add(new IncidenteDto(incidente));
		}
		return incidenteDto;
	}
	
	public List<Incidente> listIncidentesCompletaDivulgacao(List<Incidente> incidentes) {
		List<Incidente> incidenteDto = new ArrayList<Incidente>();
		for(Incidente incidente : incidentes){
			Plano plano = incidente.getPlanoacao();
			if(plano.isNotficacaopubli())
				incidenteDto.add(incidente);
		}
		return incidentes;
	}
	
	public String getStatusIncidente(boolean status) {
		return (!status) ? "Aberto" : "Encerrado";
	}
	
	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public String getStatus() {
		return status;
	}

	public int getVersao() {
		return versao;
	}
	
	
}
