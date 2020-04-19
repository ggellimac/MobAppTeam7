package com.example.eventapp.ui.bookmark;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BookmarkViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BookmarkViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Host of <b><i>Post-modern Party</i></b> changed the event time.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}