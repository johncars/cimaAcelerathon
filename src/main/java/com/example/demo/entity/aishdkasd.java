package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "ibk_loan_calendar")
public class IbkLoanCalendar {
    
    @Id
    private String ruc;

    public IbkLoanCalendar() {  }

    public IbkLoanCalendar(String ruc) {
        this.setRuc(ruc);
    }

    public String getRuc() {
        return this.ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

}