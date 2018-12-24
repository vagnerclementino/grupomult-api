package br.com.grupomult.flows.carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.entities.ResponsePutCarros;
import br.com.grupomult.converter.CarroConverter;
import br.com.grupomult.entities.Carro;
import br.com.grupomult.models.CarroModel;

public class AtualizaCarrosConverter extends CarroConverter {

	@Autowired
	private AtualizaCarroResponse response;

	public ResponseEntity<ResponsePutCarros> execute(Carro entity) {
		return response.execute(entity);
	}

	public Carro execute(CarroModel carro) {
		return CarroConverter.convert(carro);
	}

}
