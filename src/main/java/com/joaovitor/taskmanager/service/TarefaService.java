package com.joaovitor.taskmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaovitor.taskmanager.model.Tarefa;
import com.joaovitor.taskmanager.repository.TarefaRepository;

@Service
public class TarefaService {
	
	@Autowired
		TarefaRepository repo;
	
	public List<Tarefa> listar(){
		return repo.findAll();
	}
	
	public Tarefa salvar(Tarefa tarefa) {
		return repo.save(tarefa);
	}
	
	public void excluir(Long id) {
	    repo.deleteById(id);
	}

}
