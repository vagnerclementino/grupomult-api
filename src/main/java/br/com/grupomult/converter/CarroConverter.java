package br.com.grupomult.converter;

import java.sql.Date;

import br.com.grupomult.entities.Carro;
import br.com.grupomult.entities.TipoCarro;
import br.com.grupomult.models.CarroModel;
import br.com.grupomult.utils.DateUtils;



public class CarroConverter {
	
	protected final static CarroModel convert(Carro entity) {
		CarroModel domain = new CarroModel();
		domain.setId(entity.getId());
		domain.setCodigo(entity.getCodigo());
		domain.setDescricao(entity.getDescricao());
		domain.setTipo(entity.getTipo().getCodigo());
		domain.setDataCriacao(DateUtils.dateToString(entity.getDataCriacao(), DateUtils.ISO8601_COMPLETE_DATE));
		domain.setDataAtualizacao(DateUtils.dateTimeToString(entity.getDataAtualizacao(),  DateUtils.ISO8601_COMPLETE_DATE_TIME));
		
		return domain;
	}
	
	protected final static Carro convert(CarroModel domain) {
		Carro entity = new Carro();
		TipoCarro tipoCarro = new TipoCarro();
		entity.setCodigo(domain.getCodigo());
		entity.setDescricao(entity.getDescricao());
		
		tipoCarro.setId(domain.getTipo());
		entity.setTipo(tipoCarro);
		
		entity.setDataCriacao(Date.valueOf(domain.getDataCriacao()));
		entity.setDataAtualizacao(Date.valueOf(domain.getDataAtualizacao()));		
		return entity;
	}

}
