package org.spring.demo1;

import java.util.List;

public class MusicPlayer {
    private List<Music> music;
    private String name;
    private int volume;

    public MusicPlayer () { }
    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public void playMusic() {
        music.forEach(song -> System.out.println("Playing: "+ song.getSong()));
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + music +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
