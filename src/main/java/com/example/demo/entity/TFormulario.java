package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "t_formulario")
public class TFormulario {

    @Id
    private String ruc;
    @Column(name = "DNI")
    private String dni;
    @Column(name = "CELULAR")
    private String celular;
    @Column(name = "CORREO")
    private String correo;
    @Column(name = "VALID_VISA")
    private String visa;
    @Column(name = "FECHA_CARGA")
    private Date fecha;

    public TFormulario() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public TFormulario(String ruc, String dni, String celular, String correo, String visa, Date fecha) {
        this.ruc = ruc;
        this.dni = dni;
        this.celular = celular;
        this.correo = correo;
        this.visa = visa;
        this.fecha = fecha;
    }

}