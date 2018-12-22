package br.com.grupomult.flows.carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.entities.ResponseGetCarrosById;
import br.com.grupomult.repositories.CarroRepository;

public class ListCarrosByIdLoad {

	@Autowired
	private CarroRepository repository;

	@Autowired
	private ListCarrosByIdLoadValidate validate;

	public ResponseEntity<ResponseGetCarrosById> execute(Integer id) {
		return validate.execute(repository.findOne(id));
	}

}
