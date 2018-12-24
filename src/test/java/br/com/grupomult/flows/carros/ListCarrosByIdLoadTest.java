package br.com.grupomult.flows.carros;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.grupomult.api.entities.ResponseGetCarrosById;
import br.com.grupomult.configuration.TestConfiguration;
import br.com.grupomult.entities.Carro;
import br.com.grupomult.repositories.CarroRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
public class ListCarrosByIdLoadTest {

	@Autowired
	private ListCarrosByIdLoad flow;

	@Autowired
	private CarroRepository repository;

	@MockBean
	private ListCarrosByIdLoadValidate validate;

	@MockBean
	private Carro entity;


	@Before
	public void setUp() throws Exception {
		Mockito
		  .when(repository.findOne(Mockito.anyLong()))
		  .thenReturn(entity);
		Mockito
		.when(validate.execute(entity))
		.thenReturn(createResponseEntityResponseGetCarrosById());
	}

	@Test
	public void testLoadSuccess() {
		ResponseEntity<ResponseGetCarrosById> response = flow.execute(new Random().nextLong());
		assertNotNull(response);
		assertEquals(HttpStatus.OK, response.getStatusCode());

		ResponseGetCarrosById body = response.getBody();
		assertNotNull(body);

	    Carro entityResponse = body.getCarro();
		assertNotNull(entityResponse);
	}

	private ResponseEntity<ResponseGetCarrosById> createResponseEntityResponseGetCarrosById() {
		ResponseGetCarrosById response = new ResponseGetCarrosById();
		response.setCarro(entity);
		return ResponseEntity.ok(response);
	}

}
