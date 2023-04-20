package org.spring.demo1;

public class ClassicalMusic implements Music {
    public void init() {
        System.out.println("Doing bean initialization");
    }
    public void destroy() {
        System.out.println("Classic Bean destroying, GoodBye");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
