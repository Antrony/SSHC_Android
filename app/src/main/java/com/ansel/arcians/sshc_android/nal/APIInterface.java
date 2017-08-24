package com.ansel.arcians.sshc_android.nal;

import com.ansel.arcians.sshc_android.bal.ZoneObject;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("zones")
    Call<ZoneObject> doGetListResources();
}
