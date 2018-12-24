package br.com.grupomult.flows.carros;

import org.springframework.http.ResponseEntity;

import br.com.grupomult.entities.Carro;
import br.com.grupomult.entities.ResponseGetCarrosById;

public class ListCarrosByIdResponse {

	public ResponseEntity<ResponseGetCarrosById> execute(Carro entity) {
		return ResponseEntity.ok(new ResponseGetCarrosById()
											.carro(entity)
								 );
	}

}
