package br.ufjf.dcc193.trb1.Models;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;




@Entity
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    private Integer fkIdSede;

    private String titulo;
    private String descricao;
    private Date data_inicio;
    private Date data_fim;

    @NotNull
    private Integer horas_assistencial;
    @NotNull
    private Integer horas_juridica;
    @NotNull
    private Integer horas_financeira;
    @NotNull
    private Integer horas_executiva;

    public Atividade() {
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }



    public Date getData_fim() {
        return data_fim;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public String getDescricao() {
        return descricao;
    }


    public Integer getHoras_assistencial() {
        return this.horas_assistencial;
    }

    public void setHoras_assistencial(Integer horas_assistencial) {
        this.horas_assistencial = horas_assistencial;
    }

    public Integer getHoras_juridica() {
        return this.horas_juridica;
    }

    public void setHoras_juridica(Integer horas_juridica) {
        this.horas_juridica = horas_juridica;
    }

    public Integer getHoras_financeira() {
        return this.horas_financeira;
    }

    public void setHoras_financeira(Integer horas_financeira) {
        this.horas_financeira = horas_financeira;
    }

    public Integer getHoras_executiva() {
        return this.horas_executiva;
    }

    public void setHoras_executiva(Integer horas_executiva) {
        this.horas_executiva = horas_executiva;
    }


    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getFkIdSede() {
        return fkIdSede;
    }

    public void setFkIdSede(Integer fkIdSede) {
        this.fkIdSede = fkIdSede;
    }
}