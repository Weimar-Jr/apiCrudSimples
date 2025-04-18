package com.empresax.apiDeCrudSimples.Repositorios;

import com.empresax.apiDeCrudSimples.Entidades.CrudDeTarefas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCrudDeTarefas extends JpaRepository<CrudDeTarefas, Long> {

}
