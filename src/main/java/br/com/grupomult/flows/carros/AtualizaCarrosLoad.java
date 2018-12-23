package br.com.grupomult.flows.carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.entities.Carro;
import br.com.grupomult.entities.ResponsePutCarros;
import br.com.grupomult.models.CarroModel;
import br.com.grupomult.repositories.CarroRepository;
import br.com.grupomult.repositories.TipoCarroRepository;
import br.com.grupomult.utils.DateUtils;

public class AtualizaCarrosLoad {

	@Autowired
	private CarroRepository repository;
	
	@Autowired
	private TipoCarroRepository tipoCarroRepository;

	@Autowired
	private AtualizaCarrosConverter converter;
	

	public ResponseEntity<ResponsePutCarros> execute(Long id, CarroModel carro) {
		
		Carro entity = converter.execute(carro);
		Carro entityMan = repository.findOne(id);
				
		entityMan.setCodigo(entity.getCodigo());
		entityMan.setDescricao(entity.getDescricao());
		
		entityMan.setTipo(tipoCarroRepository.findById(entity.getTipo().getId()));
		
		entityMan.dataCriacao(entity.getDataCriacao());
		
		entityMan.setDataAtualizacao(DateUtils.getCurrentTime());
        		
		return converter.execute(repository.save(entityMan));
	}

}
