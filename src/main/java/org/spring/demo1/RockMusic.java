package org.spring.demo1;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Data
@Component
@Qualifier("music")
public class RockMusic implements Music {
    ArrayList<String> musicList = new ArrayList<>();

    public RockMusic() {
        musicList.add("Led Zeppelin: Whole Lotta Love" );
        musicList.add("Queen: Bohemian Rhapsody" );
        musicList.add("Led Zeppelin: Kashmir");
    }

    @Override
    public String getSong(int index) {
        return this.musicList.get(index);
    }
}
