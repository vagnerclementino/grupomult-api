package br.com.grupomult.flows.carros;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.entities.ResponsePostCarros;
import br.com.grupomult.constants.MessageConstants;
import br.com.grupomult.exceptions.HttpBadRequestException;
import br.com.grupomult.models.CarroModel;
import br.com.grupomult.utils.StringUtils;

public class AdicionaCarrosValidate {

	@Autowired
	private AdicionaCarrosLoad load;

	public ResponseEntity<ResponsePostCarros> execute(CarroModel carro) {
		
		if (!Optional.ofNullable(carro.getCodigo()).isPresent() || carro.getCodigo() < 0) {
			throw new HttpBadRequestException(MessageConstants.ERROR_INVALID_CODIGO_CARRO);
		}
		if (StringUtils.isBlank(carro.getDescricao())) {
			throw new HttpBadRequestException(MessageConstants.ERROR_INVALID_DESCRICAO_BLANK);
		}
		if (!Optional.ofNullable(carro.getTipo()).isPresent() || carro.getTipo() < 0) {
			throw new HttpBadRequestException(MessageConstants.ERROR_INVALID_CODIGO_CARRO);
		}
		return load.execute(carro);
	}

}
