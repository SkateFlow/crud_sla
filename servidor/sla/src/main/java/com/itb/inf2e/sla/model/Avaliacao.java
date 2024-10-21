package com.itb.inf2e.sla.model;

public class Avaliacao {

    private Long id;
    private String RM;
    private String nome;
    private String comentario;

    // Construtor vazio
    public Avaliacao() {
    }

    // Construtor completo
    public Avaliacao(String RM, String nome, String comentario) {
        this.RM = RM;
        this.nome = nome;
        this.comentario = comentario;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRM() {
        return RM;
    }

    public void setRM(String RM) {
        this.RM = RM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    // Método toString
    @Override
    public String toString() {
        return "Avaliacao{" +
                "id=" + id +
                ", RM='" + RM + '\'' +
                ", nome='" + nome + '\'' +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
