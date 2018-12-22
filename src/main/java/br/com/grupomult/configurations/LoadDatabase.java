package br.com.grupomult.configurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.grupomult.entities.Carro;
import br.com.grupomult.repositories.CarroRepository;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {

	@Bean
	public CommandLineRunner initDatabase(CarroRepository repository) {
		return args -> {
//			log.info("Preloading " + repository.save(createAnimal("Janis", "2015-02-09", CANINE)).toString());
//			log.info("Preloading " + repository.save(createAnimal("Rocky", "2014-10-15", FELINE)).toString());
		};
	}

//	private static Carro createCarro(Long codigo, String descricao, LocalDate date) {
//		return Carro.builder()
//					.codigo(codigo)
//					.descricao(descricao)
//					.dataCriacao(date)
//					.name(name)
//					.dob(stringToDate(dob, ISO8601_COMPLETE_DATE))
//				.	species(Species.builder().code(species).build()).build();
//	}

}
