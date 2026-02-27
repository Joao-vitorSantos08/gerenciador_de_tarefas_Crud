package com.joaovitor.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaovitor.taskmanager.model.Tarefa;


@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
