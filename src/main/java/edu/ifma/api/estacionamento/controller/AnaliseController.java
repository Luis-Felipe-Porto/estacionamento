package edu.ifma.api.estacionamento.controller;


import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import edu.ifma.api.estacionamento.model.Aluno;
import edu.ifma.api.estacionamento.model.Analise;
import edu.ifma.api.estacionamento.model.Condutor;
import edu.ifma.api.estacionamento.model.Servidor;
import edu.ifma.api.estacionamento.model.Tercerizado;
import edu.ifma.api.estacionamento.repository.AnaliseRepository;
import edu.ifma.api.estacionamento.repository.CondutorRepository;



@RestController
@RequestMapping("analise-cadastro")
public class AnaliseController {

	@Autowired
	private CondutorRepository condutorRepository;
	@Autowired
	private AnaliseRepository analiseRepository;
	
	@PostMapping("/servidor")
	public void analiseServidor(@RequestBody  @Valid Servidor condutor) {	
		this.condutorRepository.save(condutor);
	}
	@PostMapping("/aluno")
	public void analiseAluno(@RequestBody @Valid Aluno aluno) {		
		this.condutorRepository.save(aluno);
	}
	@PostMapping("/tercerizado")
	public void analiseTercerizado(@RequestBody @Valid Tercerizado tercerizado) {		
		this.condutorRepository.save(tercerizado);
	}
	@GetMapping
	public Page<Condutor> pedidosPendentes(@PageableDefault(sort = "id", direction = Sort.Direction.ASC, page = 0, size = 2)
	Pageable pageable) {
		return this.condutorRepository.pedidosPendente(pageable);
	}
	@PostMapping("/{id}")
	public ResponseEntity<?> analisar(@PathVariable Long id,@RequestBody  Analise analise ){
		Optional<Condutor> optional = this.condutorRepository.findById(id);
		if(optional.isPresent()) {
			analise.setCondutorAnalisado(optional.get());
			this.analiseRepository.save(analise);
			return ResponseEntity.ok(analise);
		}
		return ResponseEntity.notFound().build();		
	}
	
}
