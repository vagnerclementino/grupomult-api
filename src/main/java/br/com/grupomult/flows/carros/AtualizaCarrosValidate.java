package br.com.grupomult.flows.carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.entities.ResponsePutCarros;
import br.com.grupomult.models.CarroModel;

public class AtualizaCarrosValidate {

	@Autowired
	private AtualizaCarrosLoad load;

	public ResponseEntity<ResponsePutCarros> execute(Long id, CarroModel carro) {
		// Nothing to validate
		return load.execute(id,carro);
	}

}
