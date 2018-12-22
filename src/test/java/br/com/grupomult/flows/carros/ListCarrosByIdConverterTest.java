package br.com.grupomult.flows.carros;

import java.time.LocalDate;

import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.grupomult.configuration.TestConfiguration;
import br.com.grupomult.converter.CarroConverter;;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
@PrepareForTest({ CarroConverter.class, LocalDate.class })
public class ListCarrosByIdConverterTest {
//
//	private static final LocalDate MOCK_LOCAL_DATE_NOW = LocalDate.of(2016, Month.FEBRUARY, 9);
//
//	private static final String NAME = "Pipoca";
//	private static final String DOB = "2015-02-09";
//	private static final SpeciesEnum SPECIES = SpeciesEnum.CANINE;
//	private static final Long AGE_IN_DAYS = 365l;
//	private static final Long AGE_IN_MONTHS = 12l;
//	private static final Long AGE_IN_YEARS = 1l;
//
//	@Autowired
//	private ListCarrosByIdConverter flow;
//
//	@Before
//	public void setUp() throws Exception {
//		mockStatic(LocalDate.class);
//		when(LocalDate.now()).thenReturn(MOCK_LOCAL_DATE_NOW);
//	}
//
//	@Test
//	public void testConvertSuccess() {
//		ResponseEntity<ResponseGetCarrosById> response = flow.execute(createEntityAnimal());
//		assertNotNull(response);
//		assertEquals(HttpStatus.OK, response.getStatusCode());
//
//		ResponseGetCarrosById body = response.getBody();
//		assertNotNull(body);
//
//		AnimalModel animal = body.getAnimal();
//		assertNotNull(animal);
//		assertEquals(NAME, animal.getName());
//		assertEquals(DOB, animal.getDob());
//		assertEquals(SPECIES, animal.getSpecies());
//		assertEquals(AGE_IN_DAYS, animal.getAgeInDays());
//		assertEquals(AGE_IN_MONTHS, animal.getAgeInMonths());
//		assertEquals(AGE_IN_YEARS, animal.getAgeInYears());
//	}
//
//	private Animal createEntityAnimal() {
//		return Animal.builder()
//					.name(NAME)
//					.dob(DateUtils.stringToDate(DOB, DateUtils.ISO8601_COMPLETE_DATE))
//					.species(Species.builder()
//							           .code(SPECIES)
//							           .build()
//							 ).build();
//	}

}
