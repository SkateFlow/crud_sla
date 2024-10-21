package com.itb.inf2e.sla.model;

import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "projeto")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_projeto")
    private Long idProjeto;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "proposta")
    private String proposta;

    @Column(name = "integrantes")
    private String integrantes;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao = LocalDateTime.now();

    @Column(name = "cod_status")
    private boolean codStatus;
    private Long id;
    private String nomeProjeto;

    // Construtores
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

    public Projeto() {

    }

    // Getters e Setters

    public Long getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(Long idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProposta() {
        return proposta;
    }

    public void setProposta(String proposta) {
        this.proposta = proposta;
    }

    public String getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String integrantes) {
        this.integrantes = integrantes;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }

    public boolean validarProjeto() {
        return false;
    }

    public Object getMensagemErro() {
        return null;
    }
}