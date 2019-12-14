package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import com.example.demo.repository.IbkdataRepository;
import com.example.demo.entity.Ibkdata;
import com.example.demo.repository.IbkLoanCalendarRepository;
import com.example.demo.entity.IbkLoanCalendar;
import com.example.demo.repository.IbkLoanDebtRepository;
import com.example.demo.entity.IbkLoanDebt;
import com.example.demo.repository.IbkdataCnRepository;
import com.example.demo.entity.IbkDataCn;
import com.example.demo.repository.TFormularioRepository;
import com.example.demo.entity.TFormulario;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import com.google.auth.oauth2.AccessToken;

@RestController
@RequestMapping(value = "/api/v1", method = RequestMethod.POST)
public class TestController {

    @Autowired
    IbkdataRepository ibkdataRespository;

    @GetMapping("/main")
    public String main(String json) {

        GoogleCredentials credentials;

        try {
            credentials = GoogleCredentials.fromStream(new FileInputStream(
                    "/home/acelerathon_cima_grupo_4/cimaAcelerathon/cimaAcelerathon/src/main/resources/chatbot-grupo-4-xulbcw-b88e26e3a39e.json"));
            if (credentials.createScopedRequired()) {
                credentials = credentials
                        .createScoped(Collections.singletonList("https://www.googleapis.com/auth/dialogflow"));
            }

            credentials.refreshIfExpired();
            AccessToken token = credentials.getAccessToken();
            return token.getTokenValue();
        } catch (IOException e) {
            return "Hubo un error";
        }

    }

    @GetMapping("/formulario")
    public void formulario(Formulario formulario) {
        System.out.println(formulario.getCorreo());
    }

    @GetMapping("/sql")
    public List<Ibkdata> sql() {
        return ibkdataRespository.findAll();
    }

    public List<Ibkdata> prueba(String string) {
        return ibkdataRespository.findprueba(string);
    }
}

class Formulario {
    private String correo;
    private String dni;
    private String celular;
    private String ruc;
    private String visa;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

}