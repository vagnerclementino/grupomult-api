package br.com.grupomult.flows.carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.entities.ResponseGetCarros;

public class ListCarrosValidate {

	@Autowired
	private ListCarrosLoad load;

	public ResponseEntity<ResponseGetCarros> execute() {
		// Nothing to validate
		return load.execute();
	}

}
