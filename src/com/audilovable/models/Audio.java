package com.audilovable.models;

public class Audio {
    private String title;
    private int minutesDuration;
    private int reproductions;
    private int likesQty;

    public void reproduce() {
        System.out.printf("Adicionou %s na fila%n", getTitle());
        reproductions++;
    }

    public void like() {
        System.out.printf("Você gostou de %s.%n", getTitle());
        likesQty++;
    }

    public String getTitle() {
        return title;
    }

    public int getMinutesDuration() {
        return minutesDuration;
    }

    public int getReproductions() {
        return reproductions;
    }

    public int getLikesQty() {
        return likesQty;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMinutesDuration(int minutesDuration) {
        this.minutesDuration = minutesDuration;
    }
}
