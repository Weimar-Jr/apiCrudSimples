package com.empresax.apiDeCrudSimples.Controllers;

import com.empresax.apiDeCrudSimples.Entidades.CrudDeTarefas;
import com.empresax.apiDeCrudSimples.Servicos.CrudService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefa")
public class ControllerDeCrudTarefas {

    private final CrudService crudService;

    public ControllerDeCrudTarefas(CrudService crudService)
    {
        this.crudService = crudService;
    }

    @PostMapping
    List<CrudDeTarefas> criar(@RequestBody CrudDeTarefas tarefa )
    {
        return  crudService.criarTarefa(tarefa);
    }

    @GetMapping
    @ResponseBody
    List<CrudDeTarefas> listar()
    {
        return crudService.listarTarefas();
    }

    @PutMapping
    List<CrudDeTarefas> atualizarTarefa(@RequestBody CrudDeTarefas tarefa)
    {
        return crudService.atualizarTarefa(tarefa);
    }

    @DeleteMapping("/{id}")
    List<CrudDeTarefas> deletarTarefa(@PathVariable("id") Long id)
    {
        return crudService.deletarTarefa(id);
    }
}
