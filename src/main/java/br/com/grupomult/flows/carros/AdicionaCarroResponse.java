package br.com.grupomult.flows.carros;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.grupomult.api.entities.ResponsePostCarros;
import br.com.grupomult.entities.Carro;

public class AdicionaCarroResponse {

	public ResponseEntity<ResponsePostCarros> execute(Carro entity) {
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(entity.getId()).toUri();
		return ResponseEntity.created(uri).body(new ResponsePostCarros()
														.carro(entity)
														.uri(uri.toString())
								);
	}

}
