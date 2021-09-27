package com.emporiovegas.projeto.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

//anotações
@Entity //Indica que essa classe é uma entidade do JPA rebernate
@Table(name = "postagem")

public class Postagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @NotNull
    @Size(min = 2, max = 150)
    private String titulo;
    @NotNull
    @Size(min = 5, max = 600)
    private String texto;

    //Sistema faz com que assim que passe algo por esse objeto seja marcado o horário
    @Temporal(TemporalType.TIMESTAMP)
    private Date data = new java.sql.Date(System.currentTimeMillis()) ;

    //getters e setters

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
