package br.ufjf.dcc193.trb1.Models;

import java.util.Date;

/**
 * Atividade
 */
public class Atividade {

    private Number id_atividade;
    private String titulo;
    private String descricao;
    private Date data_inicio;
    private Date data_fim;
    private Number horas_assistencial;
    private Number horas_juridica;
    private Number horas_financeira;
    private Number horas_executiva;

    public Atividade() {

        
    }

    public Number getId_atividade() {
        return id_atividade;
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


    public Number getHoras_assistencial() {
        return this.horas_assistencial;
    }

    public void setHoras_assistencial(Number horas_assistencial) {
        this.horas_assistencial = horas_assistencial;
    }

    public Number getHoras_juridica() {
        return this.horas_juridica;
    }

    public void setHoras_juridica(Number horas_juridica) {
        this.horas_juridica = horas_juridica;
    }

    public Number getHoras_financeira() {
        return this.horas_financeira;
    }

    public void setHoras_financeira(Number horas_financeira) {
        this.horas_financeira = horas_financeira;
    }

    public Number getHoras_executiva() {
        return this.horas_executiva;
    }

    public void setHoras_executiva(Number horas_executiva) {
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

    public void setId_atividade(Number id_atividade) {
        this.id_atividade = id_atividade;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}