package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.TFormulario;

import java.util.List;

@Repository
public interface TFormularioRepository extends JpaRepository<TFormulario, Integer> {

    @Query(value = "INSERT INTO T_FORMULARIO SELECT ?1,?2,?3,?4,?5,NOW();", nativeQuery = true)
    void setnewFormulario(String ruc, String dni, String correo, String celular, String visa);
}