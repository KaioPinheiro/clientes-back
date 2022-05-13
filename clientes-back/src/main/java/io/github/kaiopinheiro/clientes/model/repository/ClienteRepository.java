package io.github.kaiopinheiro.clientes.model.repository;

import io.github.kaiopinheiro.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}
