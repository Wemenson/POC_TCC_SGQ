package br.com.sgq.gestorincidentes.form;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat
public class IncidenteFormResolver {
	
	private Long id;
	private boolean incidenteResolvido;
	private LocalDateTime dataAtualizacao;
	private int retentativas;

	public IncidenteFormResolver(Long id) {
			this.id = id;
			this.incidenteResolvido = true;
			this.dataAtualizacao = LocalDateTime.now();	
	}
	
	public Long getId() {
		return id;
	}
	
	public boolean isIncidenteResolvido() {
		return incidenteResolvido;
	}
	
	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public int getRetentativas() {
		return retentativas;
	}

	public void setRetentativas(int retentativas) {
		this.retentativas = retentativas+1;
	}
	
	
	
}
