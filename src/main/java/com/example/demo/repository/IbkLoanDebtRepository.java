package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.IbkLoanDebt;

import java.util.List;

@Repository
public interface IbkLoanDebtRepository extends JpaRepository<IbkLoanDebt, Integer> {

}