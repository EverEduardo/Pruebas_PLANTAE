package com.uv.pruebas_plantae.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
       // mText.setValue("This is home fragment"); (esto es el texto por defecto en la pantalla)
    }

    public LiveData<String> getText() {
        return mText;
    }
}