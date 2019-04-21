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
    private Date horas_computadas;
    private String categoria;

    public Atividade() {
        
    }

    public Number getId_atividade() {
        return id_atividade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
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

    public Date getHoras_computadas() {
        return horas_computadas;
    }


    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public void setHoras_computadas(Date horas_computadas) {
        this.horas_computadas = horas_computadas;
    }

    public void setId_atividade(Number id_atividade) {
        this.id_atividade = id_atividade;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}