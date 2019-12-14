package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_FORMULARIO")
public class TFormulario {

    @Id
    private String ruc;

    public TFormulario() {
    }

    public TFormulario(String ruc) {
        this.setRuc(ruc);
    }

    public String getRuc() {
        return this.ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

}