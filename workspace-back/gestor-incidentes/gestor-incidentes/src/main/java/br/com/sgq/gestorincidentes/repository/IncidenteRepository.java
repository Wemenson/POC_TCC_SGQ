package br.com.sgq.gestorincidentes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sgq.gestorincidentes.model.Incidente;

@Repository
public interface IncidenteRepository extends JpaRepository<Incidente, Long> {
	
} 

