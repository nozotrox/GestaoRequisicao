package com.example.accessingdatamysql.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "consumivel")
public class Consumivel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int codigo;

    @Column(nullable = false, columnDefinition = "varchar(255) default ''")
    protected String nome;

    @Column(nullable = false, columnDefinition = "varchar(255) default ''")
    protected String descricao;

    public Consumivel(@JsonProperty("nome") String nome, @JsonProperty("descricao") String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}