package io.github.henriquempereira.audioplayer.app;

import io.github.henriquempereira.audioplayer.model.Music;
import io.github.henriquempereira.audioplayer.model.PodCast;

public class Main {
    public static void main(String[] args) {
        Music musica1 = new Music();
        musica1.setTitle("Yours");
        musica1.setNameOfSinger("Post Malone");
        musica1.setMusicAlbum("F-1Trillion Album Livestream");

        for(int i = 0; i < 120; i++) {
            musica1.likeAnAudio();
        }
        System.out.println("A classificação é: " + musica1.getRating());

        PodCast podcast1 = new PodCast();
        podcast1.setTitle("Flow");

        for(int i = 0; i < 37; i++){
            podcast1.likeAnAudio();
        }
        System.out.println("A classificação é: " + podcast1.getRating());
    }
}