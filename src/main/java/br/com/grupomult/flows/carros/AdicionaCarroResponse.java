package br.com.grupomult.flows.carros;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.grupomult.entities.ResponsePostCarros;
import br.com.grupomult.models.CarroModel;

public class AdicionaCarroResponse {

	public ResponseEntity<ResponsePostCarros> execute(CarroModel carroModel) {
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(carroModel.getId()).toUri();
		return ResponseEntity.ok(new ResponsePostCarros()
										.carro(carroModel)
										.uri(uri.toString())
								);
	}

}
