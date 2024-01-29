package br.com.capflix.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.capflix.model.Cliente;
import br.com.capflix.model.dto.ClienteEntradaDto;
import br.com.capflix.model.dto.ClienteSaidaDto;
import br.com.capflix.service.ClienteService;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("cliente")
@Log4j2
public class ConcessionariaController {

	@Autowired
	private ClienteService service;


	@PostMapping
	public ClienteSaidaDto salvar(@Valid @RequestBody ClienteEntradaDto entradaDto) {
		log.info("salvar: {}" + entradaDto);
		return service.salvar(entradaDto);
	}

	@PutMapping("id/{id}")
	public boolean alterar(@PathVariable("id") Integer id, @RequestBody ClienteEntradaDto entradaDto) {
		log.info("alterar: {}, {}, {}, {} " + id + " " + entradaDto);
		return service.alterar(id, entradaDto);

	}

	@GetMapping("id/{id}")
	public ClienteSaidaDto pagarUm(@PathVariable("id") Integer id) {
		log.info("pegarUm: {} " + id);

		return service.pegarUm(id);
	}

	@DeleteMapping("id/{id}")
	public boolean excluir(@PathVariable("id") Integer id) {
		log.info("excluir: {} " + id);

		return service.excluir(id);
	}

	@GetMapping("listar")
	public List<ClienteSaidaDto>listar() {
		log.info("listar");
		return service.listar();
	}
}