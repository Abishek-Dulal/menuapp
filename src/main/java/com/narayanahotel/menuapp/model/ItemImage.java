package com.narayanahotel.menuapp.model;

import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.Lob;

@Embeddable
public class ItemImage {
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String details;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] images;

    private String title;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public byte[] getImages() {
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
