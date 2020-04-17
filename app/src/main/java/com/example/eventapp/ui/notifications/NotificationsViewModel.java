package com.example.eventapp.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Host of <b><i>Post-modern Party</i></b> changed the event time.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}