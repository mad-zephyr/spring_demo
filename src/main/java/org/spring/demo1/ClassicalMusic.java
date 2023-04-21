package org.spring.demo1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    ArrayList<String> musicList = new ArrayList<>();
    public ClassicalMusic() {
        musicList.add("Beethoven: Für Elise");
        musicList.add("Puccini: 'O mio babbino caro' from Gianni Schicchi");
        musicList.add("Vivaldi: The Four Seasons");
    }
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @PostConstruct
    public void init() {
        System.out.println("Hello, Doing Classic bean initialization");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Classic Bean destroying, GoodBye");
    }

    @Override
    public String getSong(int index) {
        return this.musicList.get(index);
    }
}
