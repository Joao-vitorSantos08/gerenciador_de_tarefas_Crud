package com.joaovitor.taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joaovitor.taskmanager.model.Tarefa;
import com.joaovitor.taskmanager.service.TarefaService;

@Controller
@RequestMapping("/tarefa")
public class TarefaController {

	@Autowired
	TarefaService service;

	@GetMapping()
	public String listarTarefa(Model model) {

		model.addAttribute("Tarefa", new Tarefa());

		model.addAttribute("tarefas", service.listar());

		return "page/lista";
	}

	@PostMapping("/salvar")
	public String salvar(@ModelAttribute Tarefa tarefa) {
		service.salvar(tarefa);
		return "redirect:/tarefa";
	}

	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable Long id) {
		service.excluir(id);
		return "redirect:/tarefa";
	}

}
