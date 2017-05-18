package tests.velka.rxjavatest.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import tests.velka.rxjavatest.model.entity.Hostel;
import tests.velka.rxjavatest.model.entity.User;

/**
 * Created by Forest on 5/10/2017.
 */

public interface ServiceAPI {

    @GET("hostels")
    Call<List<Hostel>> getHostels();

    @GET("/auth/login")
    Call<User> authorize(@Query("email") String email, @Query("password") String password);
}
