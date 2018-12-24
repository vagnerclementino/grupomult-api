package br.com.grupomult.flows.carros;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.entities.ResponseDeleteCarros;
import br.com.grupomult.constants.MessageConstants;
import br.com.grupomult.entities.Carro;
import br.com.grupomult.exceptions.HttpNotFoundException;
import br.com.grupomult.repositories.CarroRepository;


public class RemoveCarrosLoadValidate {

	@Autowired
	private RemoveCarrosConverter converter;
	@Autowired
	private CarroRepository repository;

	public ResponseEntity<ResponseDeleteCarros> execute(Carro carro) {
		if (Optional.ofNullable(carro).isPresent()) {
			repository.delete(carro.getId());
			return converter.execute(carro);
		} else {
			throw new HttpNotFoundException(MessageConstants.ERROR_ID_NOT_FOUND);
		}
	}

}
