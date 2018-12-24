package br.com.grupomult.flows.carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.entities.ResponsePostCarros;
import br.com.grupomult.models.CarroModel;

public class AdicionaCarrosValidate {

	@Autowired
	private AdicionaCarrosLoad load;

	public ResponseEntity<ResponsePostCarros> execute(CarroModel carro) {
		// Nothing to validate
		return load.execute(carro);
	}

}
