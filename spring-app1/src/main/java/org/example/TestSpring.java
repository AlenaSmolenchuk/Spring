package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // use methods
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

        /* independently implementing the dependency
         Music music = context.getBean("musicBean", Music.class);
         MusicPlayer musicPlayer = new MusicPlayer(music);
        */

        /* with constructor or setter use scope=prototype
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean compare = firstMusicPlayer == secondMusicPlayer;

        System.out.println(compare);

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

         */

//        musicPlayer.playMusic();

         /* use external files (musicPlayer.properties)
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


        * use collections (List)

        MusicPlayerList musicList = context.getBean("musicPlayerList", MusicPlayerList.class);
        musicList.playMusicList();

         */
        context.close();
    }
}
