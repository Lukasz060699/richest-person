package com.example.persons;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PersonAPI {

    // https://run.mocky.io/     v3/f701ba6f-e0b5-4b7e-8627-2d49a38e84d8

    @GET("v3/f701ba6f-e0b5-4b7e-8627-2d49a38e84d8")
    Call<JsonResponse> getPersons();

}
