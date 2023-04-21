package org.spring.demo1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FolkMusic implements Music{

    @Override
    public String getSong(int index) {
        return "Happy Indie Folk";
    }
}
