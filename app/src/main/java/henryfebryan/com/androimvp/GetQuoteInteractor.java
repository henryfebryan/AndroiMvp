package henryfebryan.com.androimvp;

public interface GetQuoteInteractor {

    interface OnFinishedListener {
        void onFinished(String string);
    }

    void getNextQuote(OnFinishedListener listener);
}
