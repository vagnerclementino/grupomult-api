package br.com.grupomult.flows.carros;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.entities.ResponsePutCarros;
import br.com.grupomult.constants.MessageConstants;
import br.com.grupomult.entities.Carro;
import br.com.grupomult.exceptions.HttpInternalErrorException;
import br.com.grupomult.exceptions.HttpNotFoundException;
import br.com.grupomult.models.CarroModel;
import br.com.grupomult.repositories.CarroRepository;
import br.com.grupomult.repositories.TipoCarroRepository;
import br.com.grupomult.utils.DateUtils;

public class AtualizaCarrosLoad {
	
    Logger log = LoggerFactory.getLogger(AtualizaCarrosLoad.class);

	@Autowired
	private CarroRepository repository;
	
	@Autowired
	private TipoCarroRepository tipoCarroRepository;

	@Autowired
	private AtualizaCarrosConverter converter;
	

	public ResponseEntity<ResponsePutCarros> execute(Long id, CarroModel carro) {		
		
		try {
			Carro entity = converter.execute(carro);
			Carro entityMan = repository.findOne(id);
			
			if (entityMan == null || entityMan.getId() == null) {
				throw new HttpNotFoundException(MessageConstants.ERROR_ID_NOT_FOUND);
			}
					
			entityMan.setCodigo(entity.getCodigo());
			entityMan.setDescricao(entity.getDescricao());
			
			entityMan.setTipo(tipoCarroRepository.findById(entity.getTipo().getId()));
			
			entityMan.dataCriacao(entity.getDataCriacao());
			
			entityMan.setDataAtualizacao(DateUtils.getCurrentTime());
	        		
			return converter.execute(repository.save(entityMan));
		}catch(HttpNotFoundException hnfe) {
			log.info(hnfe.getMessage());
			throw new HttpNotFoundException(MessageConstants.ERROR_ID_NOT_FOUND);
		}
		catch (Exception e) {
			log.error(e.getMessage());
			throw new HttpInternalErrorException(MessageConstants.ERROR_INTERNAL_SERVER_ERROR);
		}
	}

}
