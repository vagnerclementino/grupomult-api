package br.com.grupomult.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.grupomult.constants.ApiConstants;
import br.com.grupomult.entities.ResponseDeleteCarros;
import br.com.grupomult.entities.ResponseGetCarros;
import br.com.grupomult.entities.ResponseGetCarrosById;
import br.com.grupomult.entities.ResponsePostCarros;
import br.com.grupomult.entities.ResponsePutCarros;
import br.com.grupomult.flows.carros.AdicionaCarrosValidate;
import br.com.grupomult.flows.carros.AtualizaCarrosValidate;
import br.com.grupomult.flows.carros.ListCarrosByIdValidate;
import br.com.grupomult.flows.carros.ListCarrosValidate;
import br.com.grupomult.flows.carros.RemoveCarrosValidate;
import br.com.grupomult.models.CarroModel;

@RestController
public class CarroApiController implements CarrosApi{
	
	@Autowired
	private ListCarrosValidate listaTodosCarrosFlow;
	
	@Autowired
	private ListCarrosByIdValidate listaCarroPorIdFlow;
	
	@Autowired
	private AdicionaCarrosValidate adicionaCarroFlow;
	
	@Autowired
	private AtualizaCarrosValidate atualizaCarroFlow;
	
	@Autowired
	private RemoveCarrosValidate removeCarroFlow;
	
	@Override
	public ResponseEntity<ResponseGetCarros> listaTodosCarros() {
		
		return listaTodosCarrosFlow.execute();
	}
	
	@Override
	public ResponseEntity<ResponseGetCarrosById> listCarroPorId (@PathVariable(value = ApiConstants.CARRO_PATH_ID, required = true) Long id) {
		
		return listaCarroPorIdFlow.execute(id);
	}
	
	@Override
	public ResponseEntity<ResponsePostCarros> adicionaCarro(@Valid @RequestBody CarroModel body) {
		
		return adicionaCarroFlow.execute(body);
	}
	
	@Override
	public ResponseEntity<ResponsePutCarros> atualizaCarro(@PathVariable(value = ApiConstants.CARRO_PATH_ID, required = true) Long id, @Valid @RequestBody  CarroModel body) {
		
		return atualizaCarroFlow.execute(id, body);
	}
	
	@Override
	public ResponseEntity<ResponseDeleteCarros> removeCarro(@PathVariable(value = ApiConstants.CARRO_PATH_ID, required = true) Long id) {
		return removeCarroFlow.execute(id);
	}

}
