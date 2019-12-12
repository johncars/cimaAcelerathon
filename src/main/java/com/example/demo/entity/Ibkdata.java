package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "ibk_data")
public class Ibkdata {
    
    @Id
    private String ruc;

    public Ibkdata() {  }

    public Ibkdata(String ruc) {
        this.setRuc(ruc);
    }

    public String getRuc() {
        return this.ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

}