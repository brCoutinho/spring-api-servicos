package com.brcoutinho.clientes.model.repository;

import com.brcoutinho.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
