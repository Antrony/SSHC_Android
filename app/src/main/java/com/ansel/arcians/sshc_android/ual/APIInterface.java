package com.ansel.arcians.sshc_android.ual;

import com.ansel.arcians.sshc_android.bal.ZoneObject;

import retrofit2.Call;
import retrofit2.http.GET;


interface APIInterface {

    @GET("zone")
    Call<ZoneObject> doGetListResources();

}
