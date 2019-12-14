package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "mar_resumen")
public class MarResumen {

    @Id
    private String ruc;
    @Column(name = "CUOTA")
    private String cuota;
    @Column(name = "MONTO_DESEMBOLSO_F")
    private String monto;
    @Column(name = "TASA_DESEMBOLSO")
    private String tasa;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "MOTIVO_NO_APROBADO")
    private String motivo;
    @Column(name = "CUENTA_NEGOCIO")
    private String cn;
    @Column(name = "TIPO_CLIENTE")
    private String tipo;

    public MarResumen() {
    }

    public String getCuota() {
        return cuota;
    }

    public void setCuota(final String cuota) {
        this.cuota = cuota;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(final String monto) {
        this.monto = monto;
    }

    public String getTasa() {
        return tasa;
    }

    public void setTasa(final String tasa) {
        this.tasa = tasa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(final String codigo) {
        this.codigo = codigo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(final String motivo) {
        this.motivo = motivo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(final String ruc) {
        this.ruc = ruc;
    }

    public String getCN() {
        return cn;
    }

    public void setCN(final String cn) {
        this.cn = cn;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(final String tipo) {
        this.tipo = tipo;
    }

    public MarResumen(final String ruc, final String motivo, final String codigo, final String tasa, final String monto,
            final String cuota, final String tipo) {
        this.ruc = ruc;
        this.motivo = motivo;
        this.codigo = codigo;
        this.tasa = tasa;
        this.monto = monto;
        this.cuota = cuota;
        this.tipo = tipo;
    }

}
