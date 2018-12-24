package br.com.grupomult.flows.carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.entities.ResponseGetCarrosById;
import br.com.grupomult.converter.CarroConverter;
import br.com.grupomult.entities.Carro;

public class ListCarrosByIdConverter extends CarroConverter {

	@Autowired
	private ListCarrosByIdResponse response;

	public ResponseEntity<ResponseGetCarrosById> execute(Carro carro) {
		return response.execute(carro);
	}

}
