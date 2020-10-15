package com.frontdesk;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import com.frontdesk.entity.Details;



@SpringBootTest
class HospitalFrontDeskApplicationTests {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	@Test
	public void testXml() throws URISyntaxException{
		String baseUrl = "http://localhost:8080/details/xml/apolo/Dentist";
		URI uri = new URI(baseUrl);
		
		ResponseEntity<Details> response= this.restTemplate.getForEntity(uri, Details.class);
		assertEquals(200, response.getStatusCodeValue());
	}
	
	@Test
	public void testJson() throws URISyntaxException{
		String baseUrl = "http://localhost:8080/details/json/apolo/Dentist";
		URI uri = new URI(baseUrl);
//		System.out.println("111111111111111111111111111111111111111111111111");
		ResponseEntity<List<Details>> response= restTemplate.exchange(baseUrl,HttpMethod.GET, null, new ParameterizedTypeReference<List<Details>>() {});
//				this.restTemplate.getForEntity(uri,new ParameterizedTypeReference<List<Details>>(){});
		System.out.println(response);
		assertEquals(200, response.getStatusCodeValue());
	}
	
	

}
