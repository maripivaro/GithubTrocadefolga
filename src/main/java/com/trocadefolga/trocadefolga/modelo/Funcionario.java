package com.trocadefolga.trocadefolga.modelo;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Funcionario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String nome;
        private LocalDateTime admissao;
        private String regimeDeTrabalho;

        public Funcionario() {}


        public Integer getId() {return id;}

        public void setId() {
        }

        public String getNome() {return nome;}

        public void setNome(String nome) {this.nome = nome;}

        public LocalDateTime getAdmissao() {return admissao;}

        public void setAdmissao(LocalDateTime of) {
        }

        public String getRegimeDeTrabalho() {return regimeDeTrabalho;}

        public void setRegimeDeTrabalho(String regimeDeTrabalho) {this.regimeDeTrabalho = regimeDeTrabalho;}



}

