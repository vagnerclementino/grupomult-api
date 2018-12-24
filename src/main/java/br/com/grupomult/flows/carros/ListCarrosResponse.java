package br.com.grupomult.flows.carros;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.grupomult.entities.Carro;
import br.com.grupomult.entities.ResponseGetCarros;

public class ListCarrosResponse {

	public ResponseEntity<ResponseGetCarros> execute(List<Carro> carrosApi) {
		if (carrosApi.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(new ResponseGetCarros().carros(carrosApi));
		}
	}

}
