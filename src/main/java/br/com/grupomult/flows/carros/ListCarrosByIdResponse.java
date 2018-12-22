package br.com.grupomult.flows.carros;

import org.springframework.http.ResponseEntity;

import br.com.grupomult.entities.ResponseGetCarrosById;
import br.com.grupomult.models.CarroModel;

public class ListCarrosByIdResponse {

	public ResponseEntity<ResponseGetCarrosById> execute(CarroModel carroModel) {
		return ResponseEntity.ok(new ResponseGetCarrosById().carro(carroModel));
	}

}
