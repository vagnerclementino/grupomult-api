package br.com.grupomult.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.grupomult.entities.Carro;

public interface CarroRepository extends CrudRepository<Carro, Long>{
	
	Optional<Carro> findByCodigo(Long codigo);

}
