package br.com.grupomult.flows.carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.converter.CarroConverter;
import br.com.grupomult.entities.Carro;
import br.com.grupomult.entities.ResponseDeleteCarros;

public class RemoveCarrosConverter extends CarroConverter {

	@Autowired
	private RemoveCarrosResponse response;

	public ResponseEntity<ResponseDeleteCarros> execute(Carro carro) {
		return response.execute(carro);
	}

}
