package com.example.eventapp.ui.search;
        import androidx.lifecycle.LiveData;
        import androidx.lifecycle.MutableLiveData;
        import androidx.lifecycle.ViewModel;


public class SearchViewModel extends ViewModel{

    private MutableLiveData<String> mText;

    public SearchViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Host of <b><i>Post-modern Party</i></b> changed the event time.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}