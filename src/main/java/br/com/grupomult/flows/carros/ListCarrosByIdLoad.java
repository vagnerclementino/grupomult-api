package br.com.grupomult.flows.carros;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.entities.ResponseGetCarrosById;
import br.com.grupomult.constants.MessageConstants;
import br.com.grupomult.exceptions.HttpInternalErrorException;
import br.com.grupomult.exceptions.HttpNotFoundException;
import br.com.grupomult.repositories.CarroRepository;

public class ListCarrosByIdLoad {
	
    Logger log = LoggerFactory.getLogger(RemoveCarrosLoad.class);

	@Autowired
	private CarroRepository repository;

	@Autowired
	private ListCarrosByIdLoadValidate validate;

	public ResponseEntity<ResponseGetCarrosById> execute(Long id) {
		try {
			return validate.execute(repository.findOne(id));

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
