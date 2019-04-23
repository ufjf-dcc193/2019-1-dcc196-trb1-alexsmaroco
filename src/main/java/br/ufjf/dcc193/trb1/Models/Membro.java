package br.ufjf.dcc193.trb1.Models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Membro {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Sede fk_sede;

    private String nome_completo;
    private String funcao;
    private String email;
    private Date data_inicio;
    private Date data_fim;


    public Membro() {
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_completo() {
        return this.nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_inicio() {
        return this.data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return this.data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }
    
}