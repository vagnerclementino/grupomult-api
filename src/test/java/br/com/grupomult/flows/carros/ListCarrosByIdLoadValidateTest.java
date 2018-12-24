package br.com.grupomult.flows.carros;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
import br.com.grupomult.exceptions.HttpNotFoundException;
import br.com.grupomult.models.CarroModel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
public class ListCarrosByIdLoadValidateTest {

	@Autowired
	private ListCarrosByIdLoadValidate flow;

	@MockBean
	private ListCarrosByIdConverter converter;

	@MockBean
	private Carro entity;

	@MockBean
	private CarroModel domain;

	@Before
	public void setUp() throws Exception {
		Mockito.when(converter.execute(entity))
				.thenReturn(createResponseEntityResponseGetAnimalsById());
	}

	@Test
	public void testValidateWithAnimalFillSuccess() {
		ResponseEntity<ResponseGetCarrosById> response = flow.execute(entity);
		assertNotNull(response);
		assertEquals(HttpStatus.OK, response.getStatusCode());

		ResponseGetCarrosById body = response.getBody();
		assertNotNull(body);

		Carro carroResponse = body.getCarro();
		assertNotNull(carroResponse);
	}

	@Test(expected = HttpNotFoundException.class)
	public void testValidateWithAnimalNullExpectedHttpNotFoundException() {
		flow.execute(null);
	}

	private ResponseEntity<ResponseGetCarrosById> createResponseEntityResponseGetAnimalsById() {
		ResponseGetCarrosById response = new ResponseGetCarrosById();
		response.setCarro(entity);
		return ResponseEntity.ok(response);
	}

}
