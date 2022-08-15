package com.example.handlingformsubmission;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pepole")
public class Pepole implements Serializable {
    @Id
    private Integer id;

    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message=message;
    }

    @Override
    public String toString() {
        return "Pepole{" +
                "id=" + id +
        ", message='" + message +
        '}';
    }

}
