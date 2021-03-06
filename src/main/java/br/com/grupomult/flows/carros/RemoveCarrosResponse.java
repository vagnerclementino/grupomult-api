package br.com.grupomult.flows.carros;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.grupomult.api.entities.ResponseDeleteCarros;
import br.com.grupomult.entities.Carro;

public class RemoveCarrosResponse {

	public ResponseEntity<ResponseDeleteCarros> execute(Carro carro) {
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().buildAndExpand().toUri();
		return ResponseEntity.ok(new ResponseDeleteCarros().carro(carro).uri(uri.toString())				);
		}
}
