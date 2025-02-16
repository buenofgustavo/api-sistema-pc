package com.apicontroladmin.demo.domain.entidades;

import com.apicontroladmin.demo.domain.DTO.LogComputadoresDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Table(name = "log_computadores")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LogComputadores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="message")
    private String message;

    @Column(name="mac_vinculado")
    private String macVinculado;

    @Column(name="computador_vinculado")
    private String computadorVinculado;

    @Column(name="user_vinculado")
    private String userVinculado;

    @Column(name = "nome_user")
    private String nomeUser;

    @Column(name="datahora")
    private LocalDateTime datahora;

    public LogComputadores(LogComputadoresDTO logComputadoresDTO){
        this.message = logComputadoresDTO.message();
        this.macVinculado = logComputadoresDTO.macVinculado();
        this.computadorVinculado = logComputadoresDTO.computadorVinculado();
        this.nomeUser = logComputadoresDTO.nomeUser();
    }

}