package com.example.marcacao;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class Retrofitconfig {

    private Retrofit retrofit;

    public Retrofitconfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("http://177.149.134.148:8995/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public MarcacaoService getMarcacoes() {
        return this.retrofit.create(MarcacaoService.class);
    }
}
