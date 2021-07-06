package br.com.forum.springbootv1.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.forum.springbootv1.modelo.Curso;
import br.com.forum.springbootv1.modelo.Topico;

@Controller
public class TopicosController {

	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> lista() {
		Topico topico = new Topico("Duvida", "Duvida no SpringBoot", new Curso("SpringBoot", "Programacao"));
		
		return Arrays.asList(topico, topico, topico);
	}
}
