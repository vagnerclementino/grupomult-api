package br.com.grupomult.flows.carros;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.entities.ResponsePostCarros;
import br.com.grupomult.constants.MessageConstants;
import br.com.grupomult.entities.Carro;
import br.com.grupomult.entities.TipoCarro;
import br.com.grupomult.exceptions.HttpBadRequestException;
import br.com.grupomult.exceptions.HttpInternalErrorException;
import br.com.grupomult.exceptions.HttpNotFoundException;
import br.com.grupomult.models.CarroModel;
import br.com.grupomult.repositories.TipoCarroRepository;

public class AdicionaCarrosLoad {
	
    Logger log = LoggerFactory.getLogger(AdicionaCarrosLoad.class);
	
	@Autowired
	private TipoCarroRepository tipoCarroRepository;

	@Autowired
	private AdicionaCarrosLoadValidate validate;
	
	@Autowired
	private AdicionaCarrosConverter converter;

	public ResponseEntity<ResponsePostCarros> execute(CarroModel carro) {
		try {
			Carro entity = converter.execute(carro);
			TipoCarro tipoCarroMan = tipoCarroRepository.findById(carro.getTipo());
			entity.setTipo(tipoCarroMan);
			//Deixando para o bando de dados gerar o id
			entity.setId(null);
			return validate.execute(entity);
		} catch(HttpNotFoundException hnfe) {
			log.info(hnfe.getMessage());
			throw new HttpNotFoundException(MessageConstants.ERROR_ID_NOT_FOUND);
		} catch (HttpBadRequestException badRequestEx) {
			throw badRequestEx;
		}
		catch (Exception e) {
			log.error(e.getMessage());
			throw new HttpInternalErrorException(MessageConstants.ERROR_INTERNAL_SERVER_ERROR);
		}
		
		
	}

}
