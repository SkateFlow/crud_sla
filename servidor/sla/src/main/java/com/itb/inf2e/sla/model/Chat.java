package com.itb.inf2e.sla.model;

import java.util.Date;

public class Chat {

    private Long id;
    private String mensagem;
    private Date dataRegistro;
    private Long idOcorrencia;

    // Construtor vazio
    public Chat() {
    }

    // Construtor completo
    public Chat(String mensagem, Date dataRegistro, Long idOcorrencia) {
        this.mensagem = mensagem;
        this.dataRegistro = dataRegistro;
        this.idOcorrencia = idOcorrencia;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Long getIdOcorrencia() {
        return idOcorrencia;
    }

    public void setIdOcorrencia(Long idOcorrencia) {
        this.idOcorrencia = idOcorrencia;
    }

    // Método toString
    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", mensagem='" + mensagem + '\'' +
                ", dataRegistro=" + dataRegistro +
                ", idOcorrencia=" + idOcorrencia +
                '}';
    }
}
