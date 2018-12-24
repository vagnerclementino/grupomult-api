package br.com.grupomult.flows.carros;

import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.entities.ResponseGetCarrosById;
import br.com.grupomult.entities.Carro;

public class ListCarrosByIdResponse {

	public ResponseEntity<ResponseGetCarrosById> execute(Carro entity) {
		return ResponseEntity.ok(new ResponseGetCarrosById()
											.carro(entity)
								 );
	}

}
