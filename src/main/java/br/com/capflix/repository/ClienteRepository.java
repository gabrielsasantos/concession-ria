package br.com.capflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.capflix.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	

}
