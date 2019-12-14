package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.MarResumen;

import java.util.List;

@Repository
public interface MarResumenRepository extends JpaRepository<MarResumen, String> {

    @Query(value = "SELECT RUC,MOTIVO_NO_APROBADO,CODIGO,TASA_DESEMBOLSO,MONTO_DESEMBOLSO_F,CUOTA,CUENTA_NEGOCIO FROM mar_resumen WHERE RUC=?1", nativeQuery = true)
    List<MarResumen> getValidacion(String ruc);
}