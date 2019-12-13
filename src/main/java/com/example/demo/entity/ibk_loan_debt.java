package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "ibk_loan_debt")
public class IbkLoanDebt{
    
    @Id
    private String ruc;

    public IbkLoanDebt() {  }

    public IbkLoanDebt(String ruc) {
        this.setRuc(ruc);
    }

    public String getRuc() {
        return this.ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

}