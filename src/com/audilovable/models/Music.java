package com.audilovable.models;

public class Music extends Audio {
    private String artist;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String getTitle() {
        return "%s de %s".formatted(super.getTitle(), getArtist());
    }
}
