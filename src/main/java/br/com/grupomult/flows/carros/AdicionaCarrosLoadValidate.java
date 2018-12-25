package br.com.grupomult.flows.carros;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.entities.ResponsePostCarros;
import br.com.grupomult.constants.MessageConstants;
import br.com.grupomult.entities.Carro;
import br.com.grupomult.exceptions.HttpBadRequestException;
import br.com.grupomult.exceptions.HttpInternalErrorException;
import br.com.grupomult.exceptions.HttpNotFoundException;
import br.com.grupomult.repositories.CarroRepository;


public class AdicionaCarrosLoadValidate {

	Logger log = LoggerFactory.getLogger(RemoveCarrosLoad.class);

	@Autowired
	private AdicionaCarrosConverter converter;
	
	@Autowired
	private CarroRepository repository;

	public ResponseEntity<ResponsePostCarros> execute(Carro carro) {
		try {
			if (!Optional.ofNullable(carro).isPresent()) {
				throw new HttpNotFoundException(MessageConstants.ERROR_ID_NOT_FOUND);
			}
			
			//Verificando se existe um carro com o mesmo código
			Optional<Carro> optionaCarro = repository.findByCodigo(carro.getCodigo());
			if(optionaCarro.isPresent()) {
				//Existe carro com o mesmo código. Lançando uma exceção.
				throw new HttpBadRequestException(MessageConstants.ERROR_CODIGO_CARRO_JA_EXISTENTE);
			}
			return converter.execute(repository.save(carro));
		}catch (HttpBadRequestException badRequestEx) {
			throw badRequestEx;
		}
		catch (Exception e) {
			
			log.error(e.getMessage());
			throw new HttpInternalErrorException(MessageConstants.ERROR_INTERNAL_SERVER_ERROR);
		}
		
	}

}

