package br.com.grupomult.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.grupomult.entities.TipoCarro;

public interface TipoCarroRepository extends CrudRepository<TipoCarro, Integer>{
	
	public TipoCarro findByDescricao(String descricao);
	
	public TipoCarro findById(Long id);

}
