package br.com.forum.springbootv1.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.forum.springbootv1.controller.dto.TopicoDto;
import br.com.forum.springbootv1.modelo.Curso;
import br.com.forum.springbootv1.modelo.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<TopicoDto> lista() {
		Topico topico = new Topico("Dúvida", "Dúvida no SpringBoot", new Curso("SpringBoot", "Programação"));
		
		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}
}
