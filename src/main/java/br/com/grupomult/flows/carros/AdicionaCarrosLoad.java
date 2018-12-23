package br.com.grupomult.flows.carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.entities.Carro;
import br.com.grupomult.entities.ResponsePostCarros;
import br.com.grupomult.entities.TipoCarro;
import br.com.grupomult.models.CarroModel;
import br.com.grupomult.repositories.CarroRepository;
import br.com.grupomult.repositories.TipoCarroRepository;

public class AdicionaCarrosLoad {

	@Autowired
	private CarroRepository repository;
	
	@Autowired
	private TipoCarroRepository tipoCarroRepository;

	@Autowired
	private AdicionaCarrosConverter converter;

	public ResponseEntity<ResponsePostCarros> execute(CarroModel carro) {
		
		Carro entity = converter.execute(carro);
		TipoCarro tipoCarroMan = tipoCarroRepository.findByDescricao(carro.getTipoCarro());
		entity.setTipoCarro(tipoCarroMan);		
		return converter.execute(repository.save(entity));
	}

}
