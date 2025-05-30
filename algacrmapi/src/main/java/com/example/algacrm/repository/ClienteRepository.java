package com.example.algacrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.algacrm.cliente.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	
	

}
