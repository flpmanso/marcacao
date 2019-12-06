package com.example.marcacao;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Marcacao {

    private int id;
    private String nome;
    private float latitude;
    private float longitude;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date dataInclusao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public Date getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Date dataInclusao) {
        this.dataInclusao = dataInclusao;
    }
}
