package br.com.grupomult.flows.carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.entities.ResponsePostCarros;
import br.com.grupomult.converter.CarroConverter;
import br.com.grupomult.entities.Carro;
import br.com.grupomult.models.CarroModel;

public class AdicionaCarrosConverter extends CarroConverter {

	@Autowired
	private AdicionaCarroResponse response;

	public ResponseEntity<ResponsePostCarros> execute(Carro carro) {
		return response.execute(carro);
	}

	public Carro execute(CarroModel carro) {
		return CarroConverter.convert(carro);
	}

}
