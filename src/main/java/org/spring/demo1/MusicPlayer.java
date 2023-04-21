package org.spring.demo1;

import java.util.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Data
@Component
public class MusicPlayer {
    Random random = new Random();
    @Getter
    @Setter
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private HashMap<MusicalGenre, Music> music;

    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.music = new HashMap<>();
        for (Music music : musicList) {
            if (music instanceof ClassicalMusic) {
                this.music.put(MusicalGenre.CLASSICAL, music);
            }
            if (music instanceof RockMusic) {
                this.music.put(MusicalGenre.ROCK, music);
            }
        }
    }

    public String playMusic(MusicalGenre genre) {
        int randomSong = random.nextInt(3);
        return this.music.get(genre).getSong(randomSong);
    }
}
