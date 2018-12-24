package br.com.grupomult.flows.carros;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.entities.ResponsePutCarros;
import br.com.grupomult.constants.MessageConstants;
import br.com.grupomult.exceptions.HttpBadRequestException;
import br.com.grupomult.models.CarroModel;

public class AtualizaCarrosValidate {

	@Autowired
	private AtualizaCarrosLoad load;

	public ResponseEntity<ResponsePutCarros> execute(Long id, CarroModel carro) {
		if (!Optional.ofNullable(id).isPresent() || id < 0) {
			throw new HttpBadRequestException(MessageConstants.ERROR_INVALID_ID);
		}
		return load.execute(id,carro);
	}

}
