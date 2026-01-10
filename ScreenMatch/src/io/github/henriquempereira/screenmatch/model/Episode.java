package io.github.henriquempereira.screenmatch.model;

public class Episode extends Title {

    private Series series;
    private int iNumberOfViews;

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public int getiNumberOfViews() {
        return iNumberOfViews;
    }

    public void setiNumberOfViews(int iNumberOfViews) {
        this.iNumberOfViews = iNumberOfViews;
    }
}
