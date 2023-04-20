package org.spring.demo1;

import org.springframework.stereotype.Component;

@Component("folkMusicBean")

public class FolkMusic implements Music{
    @Override
    public String getSong() {
        return "Happy Indie Folk";
    }
}
