package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    // @Value implements the value
    @Value("${musicPlayer.name}")
    private  String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    // DI with annotation @Autowired
    // can be used with constructor,setter or field

    private ClassicalMusic music1;
    private RockMusic music2;
    private RapMusic music3;

    // @Qualifier qualify id of bean
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") ClassicalMusic music1,
                       @Qualifier("rockMusic") RockMusic music2,
                       @Qualifier("rapMusic") RapMusic music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public void playMusic() {
        System.out.println(music1.getSong());
    }

    /* public void playMusic(Genre genre) {
        Random rand = new Random();

        int number = rand.nextInt(3);

        if (genre == Genre.CLASSICAL) {

            System.out.println(music1.getSong().get(number));

        } else if (genre == Genre.RAP) {

            System.out.println(music3.getSong().get(number));

        } else {

            System.out.println(music2.getSong().get(number));

        }
    } */

}

