package br.com.grupomult.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.grupomult.constants.ApiConstants;
import br.com.grupomult.entities.ResponseGetCarros;
import br.com.grupomult.entities.ResponseGetCarrosById;
import br.com.grupomult.flows.carros.ListCarrosByIdValidate;
import br.com.grupomult.flows.carros.ListCarrosValidate;

@RestController
public class CarroApiController implements CarrosApi{
	
	@Autowired
	private ListCarrosValidate listCarrosFlow;
	
	@Autowired
	private ListCarrosByIdValidate listCarrosByIdFlow;
	
	@Override
	public ResponseEntity<ResponseGetCarros> listAllCarro() {
	
		return listCarrosFlow.execute();
	}
	
	
	
	@Override
	public ResponseEntity<ResponseGetCarrosById> listCarro(@PathVariable(value = ApiConstants.GET_LIST_ANIMALS_BY_ID_PATH_ID, required = true) Long id) {
		
		return listCarrosByIdFlow.execute(id);
	}

}
