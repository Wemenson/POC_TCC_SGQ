package br.com.sgq.gestorincidentes;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import br.com.sgq.gestorincidentes.dto.IncidenteDto;
import br.com.sgq.gestorincidentes.form.IncidenteForm;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class GestorIncidentesApplicationTests {
	
	@LocalServerPort
	int randomServerPort;
	
	@Test
	public void testListarIncidentes_Sucesso() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:" + randomServerPort + "/incidente";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	     
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertEquals(true, result.getBody().contains("id"));
	}
	
	@Test
	public void testDescricaoIncidente_Sucesso() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     String id = "/findById?id=6";
	    final String baseUrl = "http://localhost:" + randomServerPort + "/incidente" + id;
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	     
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertEquals(true, result.getBody().contains("id"));
	}
	
	@Test
	public void testInserirIncidente_Sucesso() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     String id = "/";
	    final String baseUrl = "http://localhost:" + randomServerPort + "/incidente" + id;
	    URI uri = new URI(baseUrl);
	    IncidenteForm incidenteForm = new IncidenteForm();
	    
	    incidenteForm.setTitulo("Teste metódo /inserir");
	    incidenteForm.setDescricao("Execução de testes");
	    incidenteForm.setDescricaoCenario("Cenário para inserir testes");
	    incidenteForm.setDataAtualizacao(LocalDateTime.now());
	    incidenteForm.setVersao(1);
	    incidenteForm.setTipoAvaliacao(1);
	    incidenteForm.setCriticidadeIncidente(1);
	    incidenteForm.setProcesso(1);
	    incidenteForm.setMaterial(1);
	    incidenteForm.setAutor(1);
	    incidenteForm.setPlanoAcao(1);
	    
	    ResponseEntity<IncidenteDto> result = restTemplate.postForEntity(uri, incidenteForm, IncidenteDto.class);
	     
	    Assert.assertEquals(201, result.getStatusCodeValue());
	    Assert.assertEquals(true, result.getBody().getId()>0);
	}
	
	
}
