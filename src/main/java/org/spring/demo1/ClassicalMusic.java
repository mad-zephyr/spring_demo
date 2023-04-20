package org.spring.demo1;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("classicMusicBean")
public class ClassicalMusic implements Music {

    private ClassicalMusic(){};

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
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
