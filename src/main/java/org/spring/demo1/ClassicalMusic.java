package org.spring.demo1;

public class ClassicalMusic implements Music {

    private ClassicalMusic(){};

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    public void init() {
        System.out.println("Hello, Doing Classic bean initialization");
    }
    public void destroy() {
        System.out.println("Classic Bean destroying, GoodBye");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
