package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Ibkdata;

import java.util.List;

@Repository
public interface IbkdataRepository extends JpaRepository<Ibkdata, Integer> {
    @Query("select RUC from ibk_data i where i.FINAL_RATE = ?1") 
    List<Ibkdata> findprueba(String j);
}