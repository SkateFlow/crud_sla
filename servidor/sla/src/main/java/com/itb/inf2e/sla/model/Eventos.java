package com.itb.inf2e.sla.model;

import java.util.Date;

public class Eventos {

    private Long id;
    private String tipoEvento;
    private String tema;
    private Date horaEvento;

    // Construtor vazio
    public Eventos() {
    }

    // Construtor completo
    public Eventos(String tipoEvento, String tema, Date horaEvento) {
        this.tipoEvento = tipoEvento;
        this.tema = tema;
        this.horaEvento = horaEvento;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(Date horaEvento) {
        this.horaEvento = horaEvento;
    }

    // Método toString
    @Override
    public String toString() {
        return "Eventos{" +
                "id=" + id +
                ", tipoEvento='" + tipoEvento + '\'' +
                ", tema='" + tema + '\'' +
                ", horaEvento=" + horaEvento +
                '}';
    }
}
