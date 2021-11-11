package br.com.sgq.gestorpublicitario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sgq.gestorpublicitario.model.CampanhaIncidente;
import br.com.sgq.gestorpublicitario.service.IncidentesServices;

@RestController
@RequestMapping({"/campanhas"})
public class CampanhaController {
	@Autowired
	public IncidentesServices incidentesServices;
	
	public CampanhaIncidente campanhaIncidente;
	
	@CrossOrigin
	@GetMapping
	public List<?> listaDivulgacao(){
		campanhaIncidente = new CampanhaIncidente();
		return campanhaIncidente.listarCampanhas(incidentesServices.retornoIncidentes());
	}
	
}
