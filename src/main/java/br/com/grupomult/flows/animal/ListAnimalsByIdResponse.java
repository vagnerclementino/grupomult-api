package br.com.grupomult.flows.animal;

import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.animal.models.AnimalModel;
import br.com.grupomult.api.animal.models.ResponseGetAnimalsById;

public class ListAnimalsByIdResponse {

	public ResponseEntity<ResponseGetAnimalsById> execute(AnimalModel animal) {
		return ResponseEntity.ok(new ResponseGetAnimalsById().animal(animal));
	}

}
