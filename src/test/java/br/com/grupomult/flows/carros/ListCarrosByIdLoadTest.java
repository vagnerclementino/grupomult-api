package br.com.grupomult.flows.carros;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.grupomult.configuration.TestConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
public class ListCarrosByIdLoadTest {
//
//	@Autowired
//	private ListAnimalsByIdLoad flow;
//
//	@Autowired
//	private AnimalRepository repository;
//
//	@MockBean
//	private ListAnimalsByIdLoadValidate validate;
//
//	@MockBean
//	private Animal entity;
//
//	@MockBean
//	private br.com.grupomult.api.animal.models.AnimalModel domain;
//
//	@Before
//	public void setUp() throws Exception {
//		when(repository.findOne(anyInt())).thenReturn(entity);
//		when(validate.execute(entity)).thenReturn(createResponseEntityResponseGetAnimalsById());
//	}
//
//	@Test
//	public void testLoadSuccess() {
//		ResponseEntity<ResponseGetAnimalsById> response = flow.execute(new Random().nextInt());
//		assertNotNull(response);
//		assertEquals(HttpStatus.OK, response.getStatusCode());
//
//		ResponseGetAnimalsById body = response.getBody();
//		assertNotNull(body);
//
//		br.com.grupomult.api.animal.models.AnimalModel animal = body.getAnimal();
//		assertNotNull(animal);
//	}
//
//	private ResponseEntity<ResponseGetAnimalsById> createResponseEntityResponseGetAnimalsById() {
//		ResponseGetAnimalsById response = new ResponseGetAnimalsById();
//		response.setAnimal(domain);
//		return ResponseEntity.ok(response);
//	}

}
