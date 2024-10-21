package com.itb.inf2e.sla.model;

public class Aluno {

    private String RM;
    private String nome;
    private String senha;
    private Long equipeId;

    // Construtor vazio (necessário para frameworks como Hibernate, Spring)
    public Aluno() {
    }

    // Construtor completo
    public Aluno(String RM, String nome, String senha, Long equipeId) {
        this.RM = RM;
        this.nome = nome;
        this.senha = senha;
        this.equipeId = equipeId;
    }

    // Getters e Setters
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Long getEquipeId() {
        return equipeId;
    }

    public void setEquipeId(Long equipeId) {
        this.equipeId = equipeId;
    }

    // Método toString para facilitar a exibição de dados
    @Override
    public String toString() {
        return "Aluno{" +
                "RM='" + RM + '\'' +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", equipeId=" + equipeId +
                '}';
    }
}
