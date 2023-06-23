package org.example;

public class MusicPlayer {
   
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic() {
        System.out.println(classicalMusic.getSong());
        System.out.println(rockMusic.getSong());
    }
}

