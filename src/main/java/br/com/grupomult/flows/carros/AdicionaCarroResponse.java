package br.com.grupomult.flows.carros;

import org.springframework.http.ResponseEntity;

import br.com.grupomult.entities.ResponseGetCarrosById;
import br.com.grupomult.entities.ResponsePostCarros;
import br.com.grupomult.models.CarroModel;

public class AdicionaCarroResponse {

	public ResponseEntity<ResponsePostCarros> execute(CarroModel carroModel) {
		return ResponseEntity.ok(new ResponsePostCarros()
										.carro(carroModel)
										.uri("localhost:8080/api/v1/carros/")
								);
	}

}
