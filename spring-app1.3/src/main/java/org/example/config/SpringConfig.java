package org.example.config;

import org.example.Music;
import org.example.MusicPlayer;
import org.example.genre.ClassicalMusic;
import org.example.genre.RapMusic;
import org.example.genre.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;


// @Configuration annotation configure ".xml"-file
@Configuration
// @ComponentScan like a tag <context:component-scan/>
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(),rockMusic(),rapMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
}
