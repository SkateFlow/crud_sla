package com.itb.inf2e.sla.controller;

import com.itb.inf2e.sla.model.Projeto;
import com.itb.inf2e.sla.repository.ProjetoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "false")
@RequestMapping("/Projeto")
public class ProjetoController {

    // Injeção de dependência do repositório de Projeto
    final ProjetoRepository projetoRepository;

    // Construtor para injeção de dependência do repositório
    public ProjetoController(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    // ROTA POST - Salva um novo projeto
    @PostMapping
    public ResponseEntity<Projeto> saveProjeto(@RequestBody Projeto projeto) {
        Projeto Projeto = null;
        Projeto savedProjeto = projetoRepository.save(Projeto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProjeto);
    }

    // ROTA GET - Lista todos os projetos
    @GetMapping
    public ResponseEntity<List<Projeto>> getAllProjetos() {
        List<Projeto> projetos = projetoRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(projetos);
    }

    // ROTA GET - Busca projeto por ID
    @GetMapping("/{id}")
    public ResponseEntity<Projeto> getProjetoById(@PathVariable Long id) {
        Optional<Projeto> projetoOptional = projetoRepository.findById(id);
        return projetoOptional.map(projeto -> ResponseEntity.status(HttpStatus.OK).body(projeto))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    // ROTA DELETE - Deleta projeto por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProjeto(@PathVariable Long id) {
        if (projetoRepository.existsById(id)) {
            projetoRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
