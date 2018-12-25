package br.com.grupomult.flows.carros;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.entities.ResponseDeleteCarros;
import br.com.grupomult.constants.MessageConstants;
import br.com.grupomult.entities.Carro;
import br.com.grupomult.exceptions.HttpInternalErrorException;
import br.com.grupomult.exceptions.HttpNotFoundException;
import br.com.grupomult.repositories.CarroRepository;

public class RemoveCarrosLoad {
	
    Logger log = LoggerFactory.getLogger(RemoveCarrosLoad.class);

	@Autowired
	private CarroRepository repository;

	@Autowired
	private RemoveCarrosLoadValidate validate;

	public ResponseEntity<ResponseDeleteCarros> execute(Long id) {
		try {
			Carro entity = repository.findOne(id);
			return validate.execute(entity);
		} catch(HttpNotFoundException hnfe) {
			log.info(hnfe.getMessage());
			throw new HttpNotFoundException(MessageConstants.ERROR_ID_NOT_FOUND);
		}
		catch (Exception e) {
			log.error(e.getMessage());
			throw new HttpInternalErrorException(MessageConstants.ERROR_INTERNAL_SERVER_ERROR);
		}
	
	}

}
