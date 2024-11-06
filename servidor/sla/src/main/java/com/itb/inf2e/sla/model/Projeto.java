package com.itb.inf2e.sla.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Projeto")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_projeto", nullable = false)
    private String nomeProjeto;

    @Column(name = "integrantes", nullable = false)
    private String integrantes;

    @Column(name = "proposta", nullable = false)
    private String proposta;

    // Construtores
    public Projeto() {
        // Construtor padrão
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
