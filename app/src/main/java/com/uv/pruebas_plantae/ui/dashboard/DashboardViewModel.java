package com.uv.pruebas_plantae.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue("This is dashboard fragment"); (esto es el texto por defecto en la pantalla)
    }

    public LiveData<String> getText() {
        return mText;
    }
}