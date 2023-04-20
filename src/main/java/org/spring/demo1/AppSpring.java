package org.spring.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Dependency control trough
//        Music music = context.getBean("music", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        TestBean testBean = context.getBean("testBean", TestBean.class);

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer1 == musicPlayer2);
        System.out.println(musicPlayer1);
        musicPlayer1.playMusic();

        System.out.println(testBean.getName());
        context.close();
    }
}
