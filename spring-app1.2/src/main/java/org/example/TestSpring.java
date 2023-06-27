package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

      /* independently implementing the dependency

        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer musicPlayer2 = new MusicPlayer(music2);

        musicPlayer2.playMusic();
       */

        /*
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();
         */

        /* dependency chain
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
         */

        /* use collections
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(Genre.CLASSICAL);
        musicPlayer.playMusic(Genre.ROCK);
        musicPlayer.playMusic(Genre.RAP);
         */
        MusicPlayer musicPlayer = context.getBean("musikPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic1 == classicalMusic2);

        context.close();
    }
}