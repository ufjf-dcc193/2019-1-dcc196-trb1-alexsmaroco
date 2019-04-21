package br.ufjf.dcc193.trb1.Models;

/**
 * Sede
 */
public class Sede {

    private Number id_sede;
    private String nome_fantasia;
    private String estado;
    private String cidade;
    private String bairro;
    private Number telefone;
    private String website;



    public Sede() {
    }


    public Number getId_sede() {
        return this.id_sede;
    }

    public void setId_sede(Number id_sede) {
        this.id_sede = id_sede;
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

    public Number getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Number telefone) {
        this.telefone = telefone;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

}