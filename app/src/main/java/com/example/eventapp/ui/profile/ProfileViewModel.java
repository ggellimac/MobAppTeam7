package com.example.eventapp.ui.profile;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;



public class ProfileViewModel extends ViewModel{


    private MutableLiveData<String> mText;

    public ProfileViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Host of <b><i>Post-modern Party</i></b> changed the event time.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}