package br.com.grupomult.flows.animal;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.animal.models.AnimalModel;
import br.com.grupomult.api.animal.models.ResponseGetAnimals;

public class ListAnimalsResponse {

	public ResponseEntity<ResponseGetAnimals> execute(List<AnimalModel> animalsApi) {
		if (animalsApi.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(new ResponseGetAnimals().animais(animalsApi));
		}
	}

}
