package org.spring.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer = context.getBean("computer", Computer.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(computer.toString());
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
