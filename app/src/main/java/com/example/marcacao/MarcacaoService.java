package com.example.marcacao;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MarcacaoService {

    @GET("marcacao/{id}")
    Call<Marcacao> getMarcacoes(@Path("id") String id);
}
