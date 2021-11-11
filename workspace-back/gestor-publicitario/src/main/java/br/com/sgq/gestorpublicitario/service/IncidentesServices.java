package br.com.sgq.gestorpublicitario.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.sgq.gestorpublicitario.model.incidente.Incidente;

@Service
@FeignClient(name = "incidente", url = "http://ec2-18-230-69-219.sa-east-1.compute.amazonaws.com:8081/incidente/listdivulgacao")
public interface IncidentesServices {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    List<Incidente> retornoIncidentes();
}
