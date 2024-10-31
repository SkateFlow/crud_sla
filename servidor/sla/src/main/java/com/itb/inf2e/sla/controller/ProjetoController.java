package com.itb.inf2e.sla.controller;

import com.itb.inf2e.sla.model.Projeto;
import com.itb.inf2e.sla.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoRepository projetoRepository;

    // Listar todos os projetos
    @GetMapping
    public List<Projeto> listarProjetos() {
        return projetoRepository.findAll();
    }

    // Criar um novo projeto
    @PostMapping
    public Projeto criarProjeto(@RequestBody Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    // Obter um projeto específico por ID
    @GetMapping("/{id}")
    public ResponseEntity<Projeto> obterProjeto(@PathVariable Long id) {
        return projetoRepository.findById(id)
                .map(projeto -> ResponseEntity.ok().body(projeto))
                .orElse(ResponseEntity.notFound().build());
    }

    // Atualizar um projeto específico por ID
    @PutMapping("/{id}")
    public ResponseEntity<Projeto> atualizarProjeto(@PathVariable Long id, @RequestBody Projeto projetoDetails) {
        return projetoRepository.findById(id)
                .map(projeto -> {
                    projeto.setNomeProjeto(projetoDetails.getNomeProjeto());
                    projeto.setIntegrantes(projetoDetails.getIntegrantes());
                    projeto.setProposta(projetoDetails.getProposta());
                    Projeto atualizado = projetoRepository.save(projeto);
                    return ResponseEntity.ok().body(atualizado);
                }).orElse(ResponseEntity.notFound().build());
    }

    // Deletar um projeto específico por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarProjeto(@PathVariable Long id) {
        return projetoRepository.findById(id)
                .map(projeto -> {
                    projetoRepository.delete(projeto);
                    return ResponseEntity.ok("Projeto deletado com sucesso");
                }).orElse(ResponseEntity.notFound().build());
    }
}
