package com.example.android.news;

/**
 * Created by Enzo on 14/7/2017.
 */

public class News {

    private final String mTitolo;
    private final String mselezionenome;
    private final String mdatapubblicata;
    private final String mUrl;

    public News(String Titolo, String selezionenome, String datapubblicata, String url) {
        this.mTitolo = Titolo;
        this.mselezionenome = selezionenome;
        this.mdatapubblicata = datapubblicata;
        this.mUrl = url;
    }

    public String getTitolo() {
        return mTitolo;
    }

    public String getselezionenome() {
        return mselezionenome;
    }

    public String getdatapubblicata() {
        return mdatapubblicata;
    }

    public String getUrl() {
        return mUrl;
    }
}
