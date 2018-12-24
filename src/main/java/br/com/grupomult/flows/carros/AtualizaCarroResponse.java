package br.com.grupomult.flows.carros;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.grupomult.entities.Carro;
import br.com.grupomult.entities.ResponsePutCarros;

public class AtualizaCarroResponse {

	public ResponseEntity<ResponsePutCarros> execute(Carro entity) {
		URI uri = ServletUriComponentsBuilder
						.fromCurrentRequest()
						.buildAndExpand()
						.toUri();
		return ResponseEntity.ok(new ResponsePutCarros()
										.carro(entity)
										.uri(uri.toString())
								);
	}

}
