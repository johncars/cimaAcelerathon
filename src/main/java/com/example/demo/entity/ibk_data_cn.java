package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "ibk_data_cn")
public class IbkLoanCn{
    
    @Id
    private String ruc;

    public IbkLoanCn() {  }

    public IbkLoanCn(String ruc) {
        this.setRuc(ruc);
    }

    public String getRuc() {
        return this.ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    
}