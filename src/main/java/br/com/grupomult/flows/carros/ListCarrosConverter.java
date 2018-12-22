package br.com.grupomult.flows.carros;

import static br.com.grupomult.utils.OptionalUtils.ofNullableAndEmpty;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.converter.CarroConverter;
import br.com.grupomult.entities.Carro;
import br.com.grupomult.entities.ResponseGetCarros;
import br.com.grupomult.models.CarroModel;

public class ListCarrosConverter extends CarroConverter {

	@Autowired
	private ListCarrosResponse response;

	public ResponseEntity<ResponseGetCarros> execute(List<Carro> carros) {

		/*
		 * Se a consulta do banco retornar uma lista nula ou vazia apenas é criada uma
		 * lista vazia do tipo de resposta da API, caso contrário é gerada uma lista com
		 * objetos de resposta da API baseados nos objetos do banco.
		 */
		List<CarroModel> animalsApi = ofNullableAndEmpty(carros)
										.orElse(Collections.emptyList())
										.stream()
										.map(ListCarrosConverter::convert)
										.collect(Collectors.toList());

		return response.execute(animalsApi);

	}

}
