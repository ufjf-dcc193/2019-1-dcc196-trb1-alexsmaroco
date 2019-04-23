package br.ufjf.dcc193.trb1.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @NotBlank(message="Campo nome não pode ser vazio")
    private String nome_fantasia;

    @NotBlank(message="Campo estado não pode ser vazio")
    private String estado;

    @NotBlank(message="Campo cidade não pode ser vazio")
    private String cidade;

    @NotBlank(message="Campo bairro não pode ser vazio")
    private String bairro;

    private Integer telefone;

    private String website;



    public Sede() {
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_fantasia() {
        return this.nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

}