package com.linjy.mvpapplication.restful.api;

import com.linjy.mvpapplication.restful.AuthProvider;
import com.linjy.mvpapplication.restful.model.UserIdentity;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by linjy on 2017/12/14.
 */

public interface Api {

    class Builder {
        public static Retrofit createRetrofit(AuthProvider provider, boolean logging) {
            if (provider == null)
                throw new NullPointerException("AuthProvider not init");
            Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                    .baseUrl(provider.getBaseUrl())
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create());
            OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
            if (logging) {
                HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
                loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                clientBuilder.addInterceptor(loggingInterceptor);
            }

            OkHttpClient client = clientBuilder.build();
            retrofitBuilder.client(client);
            return retrofitBuilder.build();
        }
    }


    @Headers({
            "Content-Type: application/json"
    })
    @POST("/v2/user_auth")
    Observable<UserIdentity.AuthResponse> userAuth(@Body UserIdentity.AuthRequest request);
}
