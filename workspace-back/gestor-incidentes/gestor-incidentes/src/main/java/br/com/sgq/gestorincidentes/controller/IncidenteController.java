package br.com.sgq.gestorincidentes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.sgq.gestorincidentes.dto.IncidenteDto;
import br.com.sgq.gestorincidentes.form.IncidenteForm;
import br.com.sgq.gestorincidentes.form.IncidenteFormResolver;
import br.com.sgq.gestorincidentes.model.Incidente;
import br.com.sgq.gestorincidentes.repository.IncidenteRepository;

@RestController
@RequestMapping({"/incidente"})
public class IncidenteController {
	@Autowired
	public IncidenteDto incidenteDto;
	
	private IncidenteRepository repository;
	
	public IncidenteController(IncidenteRepository incidenteRepository) {
	       this.repository = incidenteRepository;
	}
	
	@CrossOrigin
	@GetMapping
	public List<IncidenteDto> findAll(){
		return incidenteDto.listIncidentes(repository.findAll());
	}
	@CrossOrigin
	@GetMapping(value = "findById")
	public ResponseEntity<?> findRegisterById(@RequestParam(value = "id") long id){
	   return repository.findById(id)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}
	
	@CrossOrigin
	@GetMapping(value = "listdivulgacao")
	public List <Incidente> getList(){
	   return incidenteDto.listIncidentesCompletaDivulgacao(repository.findAll());
	}
	
	@CrossOrigin
	@PostMapping
	public ResponseEntity<IncidenteDto> create(@RequestBody IncidenteForm form){
		Incidente incidente = form.registrarNovoIncidente();
		repository.save(incidente);
		incidenteDto = new IncidenteDto(incidente);
	    return new ResponseEntity<IncidenteDto>(incidenteDto, HttpStatus.CREATED);
	    		
	}
	
	@CrossOrigin
	@PutMapping(value="resolver/{id}")
	  public ResponseEntity<IncidenteDto> resolverIncidente(@PathVariable("id") long id){
		IncidenteFormResolver resolve = new IncidenteFormResolver(id);
	    return repository.findById(resolve.getId())
	        .map(record -> {
	        	record.setDataatualizacao(resolve.getDataAtualizacao());
	            record.setResultadosatisfatorio(resolve.isIncidenteResolvido());
	            Incidente updated = repository.save(record);
	            incidenteDto = new IncidenteDto(updated);
	            return ResponseEntity.ok().body(incidenteDto);
	        }).orElse(ResponseEntity.notFound().build());
	  }
	
	@CrossOrigin
	@PutMapping(value="reavaliacao/{id}")
	  public ResponseEntity<IncidenteDto> reavaliacao(@PathVariable("id") long id){
		IncidenteFormResolver resolve = new IncidenteFormResolver(id);
	    return repository.findById(resolve.getId())
	        .map(record -> {
	        	record.setDataatualizacao(resolve.getDataAtualizacao());
	        	resolve.setRetentativas(record.getVersao());
	        	record.setVersao(resolve.getRetentativas());
	            Incidente updated = repository.save(record);
	            incidenteDto = new IncidenteDto(updated);
	            return ResponseEntity.ok().body(incidenteDto);
	        }).orElse(ResponseEntity.notFound().build());
	  }
	
	@CrossOrigin
	@DeleteMapping(path ={"/{id}"})
	  public ResponseEntity<?> delete(@PathVariable("id") long id) {
	    return repository.findById(id)
	        .map(record -> {
	            repository.deleteById(id);
	            return ResponseEntity.ok().build();
	        }).orElse(ResponseEntity.notFound().build());
	  }
}
