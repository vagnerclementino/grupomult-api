package br.com.grupomult.flows.carros;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import br.com.grupomult.api.entities.ResponsePostCarros;
import br.com.grupomult.builders.CarroBuilder;
import br.com.grupomult.configuration.TestConfiguration;
import br.com.grupomult.converter.CarroConverter;
import br.com.grupomult.entities.Carro;
import br.com.grupomult.utils.DateUtils;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
@PrepareForTest({ CarroConverter.class, LocalDate.class })
public class AdicionaCarrosConverterTest {

	private static final LocalDate MOCK_LOCAL_DATE_NOW = LocalDate.of(2016, Month.FEBRUARY, 9);

	private static final Long CODIGO_CARRO = 22L;
	private static final String DESCRICAO_CARRO = "VW Gol";
	private static final String DATA_CRIACAO = "2018-12-22 02:00";
	private static final String DATA_ATUALIZACAO = "2018-12-22 02:00";
	private static final Long CODIGO_TIPO_CARRO = 1L;
	private static final String DESCRICAO_TIPO_CARRO = "Passeio";
	

	@Autowired
	private AdicionaCarrosConverter flow;

	@Before
	public void setUp() throws Exception {
		PowerMockito.mockStatic(LocalDate.class);
		Mockito.when(LocalDate.now()).thenReturn(MOCK_LOCAL_DATE_NOW);
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
	}

	@Test
	public void testConvertSuccess() {
		ResponseEntity<ResponsePostCarros> response = flow.execute(CarroBuilder.createEntityCarro());
		assertNotNull(response);
		assertEquals(HttpStatus.CREATED, response.getStatusCode());

		ResponsePostCarros body = response.getBody();
		assertNotNull(body);

		Carro carro = body.getCarro();
		assertNotNull(carro);
		assertEquals(CarroBuilder.CODIGO_CARRO, carro.getCodigo());
		assertEquals(CarroBuilder.DESCRICAO_CARRO, carro.getDescricao());
		assertEquals(CarroBuilder.DATA_CRIACAO, DateUtils.dateToString(carro.getDataCriacao(), DateUtils.ISO8601_COMPLETE_DATE_TIME));
		assertEquals(CarroBuilder.DATA_ATUALIZACAO, DateUtils.dateToString(carro.getDataAtualizacao(), DateUtils.ISO8601_COMPLETE_DATE_TIME));
		assertEquals(CarroBuilder.CODIGO_TIPO_CARRO, carro.getTipo().getCodigo());
		assertEquals(CarroBuilder.DESCRICAO_TIPO_CARRO, carro.getTipo().getDescricao());		
	}

	
}
