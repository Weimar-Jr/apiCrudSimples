package com.empresax.apiDeCrudSimples.Servicos;

import com.empresax.apiDeCrudSimples.Entidades.CrudDeTarefas;
import com.empresax.apiDeCrudSimples.Repositorios.RepositorioCrudDeTarefas;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {

    private final RepositorioCrudDeTarefas repositorioCrudDeTarefas;

    public CrudService(RepositorioCrudDeTarefas repositorioCrudDeTarefas)
    {
        this.repositorioCrudDeTarefas = repositorioCrudDeTarefas;
    }

    public List<CrudDeTarefas> listarTarefas()
    {
        return repositorioCrudDeTarefas.findAll();
    }

    public List<CrudDeTarefas> criarTarefa(CrudDeTarefas tarefa)
    {
        repositorioCrudDeTarefas.save(tarefa);
        return listarTarefas();
    }

    public List<CrudDeTarefas> atualizarTarefa(CrudDeTarefas tarefa)
    {
        repositorioCrudDeTarefas.save(tarefa);
        return listarTarefas();
    }

    public List<CrudDeTarefas> deletarTarefa(Long id )
    {
        repositorioCrudDeTarefas.deleteById(id);
        return listarTarefas();
    }

}
