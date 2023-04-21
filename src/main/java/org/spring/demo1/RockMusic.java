package org.spring.demo1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusic implements Music {
    ArrayList<String> musicList = new ArrayList<>();
    public RockMusic() {
        musicList.add("Led Zeppelin: Whole Lotta Love\n" );
        musicList.add("Queen: Bohemian Rhapsody\n" );
        musicList.add("Led Zeppelin: Kashmir\n");
    }

    @Override
    public String getSong(int index) {
        return this.musicList.get(index);
    }

}
