package br.com.grupomult.converter;

import br.com.grupomult.entities.Carro;
import br.com.grupomult.entities.TipoCarro;
import br.com.grupomult.models.CarroModel;
import br.com.grupomult.utils.DateUtils;



public class CarroConverter {
	
	protected CarroConverter() {
		
	}
	
	protected static final  CarroModel convert(Carro entity) {
		CarroModel domain = new CarroModel();
		domain.setId(entity.getId());
		domain.setCodigo(entity.getCodigo());
		domain.setDescricao(entity.getDescricao());
		domain.setTipo(entity.getTipo().getId());
		domain.setDataCriacao(DateUtils.dateToString(entity.getDataCriacao(), DateUtils.ISO8601_COMPLETE_DATE));
		domain.setDataAtualizacao(DateUtils.dateTimeToString(entity.getDataAtualizacao(),  DateUtils.ISO8601_COMPLETE_DATE_TIME));
		
		return domain;
	}
	
	protected static final Carro convert(CarroModel domain) {
		Carro entity = new Carro();
		TipoCarro tipoCarro = new TipoCarro();
		entity.setCodigo(domain.getCodigo());
		entity.setDescricao(domain.getDescricao());
		
		tipoCarro.setId(domain.getTipo());
		entity.setTipo(tipoCarro);
		
		entity.setDataCriacao(DateUtils.stringToDate(domain.getDataCriacao(), DateUtils.ISO8601_COMPLETE_DATE));
		entity.setDataAtualizacao(DateUtils.stringToDate(domain.getDataAtualizacao(), DateUtils.ISO8601_COMPLETE_DATE_TIME));		
		return entity;
	}

}
