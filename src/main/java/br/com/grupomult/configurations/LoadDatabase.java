package br.com.grupomult.configurations;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.grupomult.entities.Carro;
import br.com.grupomult.entities.TipoCarro;
import br.com.grupomult.repositories.CarroRepository;
import br.com.grupomult.repositories.TipoCarroRepository;
import br.com.grupomult.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {

	@Bean
	public CommandLineRunner initDatabase(TipoCarroRepository tipoCarroRepository,  CarroRepository carroRepository) {
		return args -> {
			TipoCarro tipoCarroSUV = tipoCarroRepository.save(createTipoCarro(1L, "SUV"));
			TipoCarro tipoCarroPasseio = tipoCarroRepository.save(createTipoCarro(2L, "Passeio"));
			
			log.info("Preloading " + tipoCarroSUV.toString());
			
			Date now =  DateUtils.getCurrentTime();
			Carro hondaFit = createCarro(1L, "Honda Fit", now, now, tipoCarroSUV);
			Carro gol = createCarro(1L, "Gol", now, now, tipoCarroPasseio);
			
			log.info("Preloading " + carroRepository.save(hondaFit).toString());
			log.info("Preloading " + carroRepository.save(gol).toString());
		};
	}

	private static Carro createCarro(Long codigo,  String descricao, Date dataCriacao,  Date dataAtualizacao, TipoCarro tipoCarro) {
		return Carro.builder()
					.codigo(codigo)
					.descricao(descricao)
					.dataCriacao(dataCriacao)
					.dataAtualizacao(dataAtualizacao)
					.tipo(tipoCarro)
					.build();
	}
	private static TipoCarro createTipoCarro(Long codigo, String descricao){
		return TipoCarro.builder()
						.codigo(codigo)
						.descricao(descricao)
						.build();
	}
						

}
