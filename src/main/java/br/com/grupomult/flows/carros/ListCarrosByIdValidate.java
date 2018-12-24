package br.com.grupomult.flows.carros;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.entities.ResponseGetCarrosById;
import br.com.grupomult.constants.MessageConstants;
import br.com.grupomult.exceptions.HttpBadRequestException;

public class ListCarrosByIdValidate {

	@Autowired
	private ListCarrosByIdLoad load;

	public ResponseEntity<ResponseGetCarrosById> execute(Long id) {
		if (!Optional.ofNullable(id).isPresent() || id < 0) {
			throw new HttpBadRequestException(MessageConstants.ERROR_INVALID_ID);
		}
		return load.execute(id);
	}

}
