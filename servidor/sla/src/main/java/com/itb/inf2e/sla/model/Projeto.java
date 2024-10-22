package com.itb.inf2e.sla.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Projeto")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Alinhado com a tabela SQL
    private Long id;

    @Column(name = "Nome_projeto", nullable = false, length = 45) // Alinhado com a tabela SQL
    private String nomeProjeto;

    @Column(name = "Integrantes", nullable = false, length = 45) // Alinhado com a tabela SQL
    private String integrantes;

    @Column(name = "Proposta", nullable = false, length = 225) // Alinhado com a tabela SQL
    private String proposta;

    // Construtores
    public Projeto() {
        // Construtor padrão
    }

    public Projeto(Long id, String nomeProjeto, String integrantes, String proposta) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.integrantes = integrantes;
        this.proposta = proposta;
    }

    public Projeto(String nomeProjeto, String integrantes, String proposta) {
        this.nomeProjeto = nomeProjeto;
        this.integrantes = integrantes;
        this.proposta = proposta;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String integrantes) {
        this.integrantes = integrantes;
    }

    public String getProposta() {
        return proposta;
    }

    public void setProposta(String proposta) {
        this.proposta = proposta;
    }
}
