package org.spring.demo1;

import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Entity
@Data
@Component
public class MusicPlayer {
    private List<Music> musicList;
    private String name;

    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    @Getter
    @Setter
    private int volume;

    public void playMusic() {
        musicList.forEach(song -> System.out.println("Playing: "+ song.getSong()));
    }

}
