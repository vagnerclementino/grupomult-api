package br.com.grupomult.flows.carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.entities.Carro;
import br.com.grupomult.entities.ResponseDeleteCarros;
import br.com.grupomult.repositories.CarroRepository;

public class RemoveCarrosLoad {

	@Autowired
	private CarroRepository repository;

	@Autowired
	private RemoveCarrosLoadValidate validate;

	public ResponseEntity<ResponseDeleteCarros> execute(Long id) {
		Carro entity = repository.findOne(id);

		return validate.execute(entity);
	}

}
