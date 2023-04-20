package org.spring.demo1;

import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Data
public class MusicPlayer {
    private List<Music> music;
    private String name;

    @Getter
    @Setter
    private int volume;

    public void playMusic() {
        music.forEach(song -> System.out.println("Playing: "+ song.getSong()));
    }

}
