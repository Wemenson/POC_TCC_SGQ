package br.com.sgq;

import java.io.IOException;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;

import org.camunda.bpm.spring.boot.starter.rest.CamundaJerseyResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/engine-rest")
public class JerseyConfig extends CamundaJerseyResourceConfig {

  public JerseyConfig() {
    register(CORSResponseFilter.class);
    //other registrations
  }
}

class CORSResponseFilter implements ContainerResponseFilter {
  public void filter(ContainerRequestContext  requestContext,ContainerResponseContext responseContext)
    throws IOException {

       MultivaluedMap<String, Object> headers = responseContext.getHeaders();

       headers.add("Access-Control-Allow-Origin", "*");
       //headers.add("Access-Control-Allow-Origin", "http://abcd.org"); //allows CORS requests only coming from abcd.org
       headers.add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
       headers.add("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, X-Codingpedia");
   }
}
