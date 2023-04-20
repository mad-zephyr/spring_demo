package org.spring.demo1;

import org.springframework.stereotype.Component;

@Component("rockMusicBean")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind Cries Mary";
    }
}
