package br.com.grupomult.builders;

import java.util.Random;

import br.com.grupomult.entities.Carro;
import br.com.grupomult.entities.TipoCarro;
import br.com.grupomult.utils.DateUtils;

public class CarroBuilder {
	
	public static final Long ID_CARRO = new Random().nextLong();
	public static final Long CODIGO_CARRO = 22L;
	public static final String DESCRICAO_CARRO = "VW Gol";
	public static final String DATA_CRIACAO = "2018-12-22 02:00";
	public static final String DATA_ATUALIZACAO = "2018-12-22 02:00";
	public static final Long CODIGO_TIPO_CARRO = 1L;
	public static final String DESCRICAO_TIPO_CARRO = "Passeio";
	
	public static Carro createEntityCarro() {
		return Carro.builder()
				    .id(ID_CARRO)
				    .codigo(CODIGO_CARRO)
				    .descricao(DESCRICAO_CARRO)
				    .dataCriacao(DateUtils.stringToDate(DATA_CRIACAO, DateUtils.ISO8601_COMPLETE_DATE_TIME))
				    .dataAtualizacao(DateUtils.stringToDate(DATA_ATUALIZACAO, DateUtils.ISO8601_COMPLETE_DATE_TIME))
					.tipo(TipoCarro.builder()
							       .codigo(CODIGO_TIPO_CARRO)
							       .descricao(DESCRICAO_TIPO_CARRO)
							       .build()
							 ).build();
	}

}
