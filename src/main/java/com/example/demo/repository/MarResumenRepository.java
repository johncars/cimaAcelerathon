package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.MarResumen;

import java.util.List;

@Repository
public interface MarResumenRepository extends JpaRepository<MarResumen, String> {

    @Query(value = "SELECT CUOTA,MONTO_DESEMBOLSO,TASA_DESEMBOLSO,CODIGO,CUENTA_NEGOCIO,MOTIVO_NO_APROBADO FROM mar_resumen WHERE RUC=?1", nativeQuery = true)
    List<MarResumen> getValidacion(String ruc);
}