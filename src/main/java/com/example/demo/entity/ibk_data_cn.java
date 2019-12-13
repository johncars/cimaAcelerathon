package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "ibk_data_cn")
public class IbkDataCn{
    
    @Id
    private String ruc;

    public IbkDataCn() {  }

    public IbkDataCn(String ruc) {
        this.setRuc(ruc);
    }

    public String getRuc() {
        return this.ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    
}