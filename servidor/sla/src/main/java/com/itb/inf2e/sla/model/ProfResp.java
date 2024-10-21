package com.itb.inf2e.sla.model;

public class ProfResp {

    private Long id;
    private String emailDoc;
    private String senha;

    // Construtor vazio
    public ProfResp() {
    }

    // Construtor completo
    public ProfResp(String emailDoc, String senha) {
        this.emailDoc = emailDoc;
        this.senha = senha;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailDoc() {
        return emailDoc;
    }

    public void setEmailDoc(String emailDoc) {
        this.emailDoc = emailDoc;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Método toString
    @Override
    public String toString() {
        return "ProfResp{" +
                "id=" + id +
                ", emailDoc='" + emailDoc + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
