package tests.velka.rxjavatest.model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import tests.velka.rxjavatest.views.HostelsView;

/**
 * Created by Forest on 5/10/2017.
 */

public class HostelListGetter {
    private static final String BASE_URL = "https://translate.yandex.net/api/v1.5/tr.json/";
    public static void loadHostels(HostelsView destinationView) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

}
