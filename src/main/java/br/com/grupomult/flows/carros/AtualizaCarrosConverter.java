package br.com.grupomult.flows.carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.converter.CarroConverter;
import br.com.grupomult.entities.Carro;
import br.com.grupomult.entities.ResponsePutCarros;
import br.com.grupomult.models.CarroModel;

public class AtualizaCarrosConverter extends CarroConverter {

	@Autowired
	private AtualizaCarroResponse response;

	public ResponseEntity<ResponsePutCarros> execute(Carro carro) {
		CarroModel domain = convert(carro);
		return response.execute(domain);
	}

	public Carro execute(CarroModel carro) {
		return CarroConverter.convert(carro);
	}

}
