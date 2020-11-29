package com.baran.webservis.RestApi;

import com.baran.webservis.Models.Bilgiler;
import retrofit2.Call;

import java.util.List;

public class ManagerAll  extends BaseManager {

    private static ManagerAll managerAllInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance() {
        return managerAllInstance;
    }

    public Call<List<Bilgiler>> getBilgiler(){
        Call<List<Bilgiler>> call = getRestApiClient().bilgiGetir();
        return call;
    }

}
