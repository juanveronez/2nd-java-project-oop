package com.audilovable;

import com.audilovable.models.Music;
import com.audilovable.models.Player;
import com.audilovable.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        Music fuiMlk = new Music();
        fuiMlk.setTitle("Fui MLK");
        fuiMlk.setArtist("Nilo");
        fuiMlk.like();

        player.add(fuiMlk);

        Podcast vortex = new Podcast();
        vortex.setTitle("Vortex 103");
        vortex.setMembers("Principe Vidane e Odeio");
        player.add(vortex);

        Music bonitaEMiseravel = new Music();
        bonitaEMiseravel.setTitle("Bonita e miserável");
        bonitaEMiseravel.setArtist("Clarissa");
        player.add(bonitaEMiseravel);

        System.out.println(player.getReproductions());
        System.out.println(player.getCurrentReproduction());

        player.skipReproduction();
        System.out.println(player.getCurrentReproduction());
    }
}
