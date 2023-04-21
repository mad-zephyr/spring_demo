package org.spring.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;

@Configuration
@ComponentScan("org.spring.demo1")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

//    @Bean
//    public ClassicalMusic classicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    @Bean
//    public RockMusic rockMusic() {
//        return new RockMusic();
//    }
//
//    @Bean
//    public MusicPlayer musicPlayer() {
//        HashMap<MusicalGenre, Music> playlist = new HashMap<>();
//        playlist.put(MusicalGenre.CLASSICAL, classicalMusic());
//        playlist.put(MusicalGenre.ROCK, rockMusic());
//        return new MusicPlayer(playlist);
//    }
//
//    @Bean
//    public Computer computer() {
//        return new Computer(musicPlayer());
//    }
}
