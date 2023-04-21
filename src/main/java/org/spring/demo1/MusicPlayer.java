package org.spring.demo1;

import java.util.List;
import java.util.Random;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Component
public class MusicPlayer {
    Random random = new Random();
    @Getter
    @Setter
    private int volume;
    private Music Classic;
    private Music Rock;
    private String name;

    public MusicPlayer() {}
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.Classic = music1;
        this.Rock = music2;
    }

    public String playMusic(MusicalGenre genre) {
        int randomSong = random.nextInt(3);
        switch (genre) {
            case CLASSICAL: {
                return this.Classic.getSong(randomSong);
            }
            case ROCK: {
                return this.Rock.getSong(randomSong);
            }
            default: return null;
        }
    }

}
