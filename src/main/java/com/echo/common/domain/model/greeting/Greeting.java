package com.echo.common.domain.model.greeting;
import java.io.Serializable;

import javax.persistence.Entity;


@Entity
public class Greeting  implements Serializable {

    private long id;
    private String content;

    public Greeting() {
    }
    
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
