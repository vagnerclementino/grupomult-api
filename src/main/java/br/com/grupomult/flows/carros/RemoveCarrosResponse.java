package br.com.grupomult.flows.carros;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.grupomult.entities.ResponseDeleteCarros;
import br.com.grupomult.models.CarroModel;

public class RemoveCarrosResponse {

	public ResponseEntity<ResponseDeleteCarros> execute(CarroModel carroModel) {
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().buildAndExpand().toUri();
		return ResponseEntity.ok(new ResponseDeleteCarros().carro(carroModel).uri(uri.toString())				);
		}
}
