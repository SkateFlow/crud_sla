package com.itb.inf2e.sla.model;

import jakarta.persistence.*;

@Entity
@Table(name = "equipe")  // Nome da tabela no banco, pode ser ajustado conforme necessário
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "descricao", length = 255)
    private String descricao;

    // Construtor sem argumentos
    public Equipe() {
    }

    // Construtor com argumentos
    public Equipe(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    // Outros métodos auxiliares, se necessário, como toString, equals e hashCode

    @Override
    public String toString() {
        return "Equipe{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}


