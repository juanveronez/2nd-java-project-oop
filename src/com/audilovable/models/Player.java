package com.audilovable.models;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<String> reproductions = new ArrayList<>();

    public void add(Audio audio) {
        audio.reproduce();
        reproductions.add(audio.getTitle());
    }

    public List<String> getReproductions() {
        return reproductions;
    }

    public String getCurrentReproduction() {
        return reproductions.getFirst();
    }

    public void skipReproduction() {
        reproductions.removeFirst();
    }
}
