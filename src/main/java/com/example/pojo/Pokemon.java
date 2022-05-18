package com.example.pojo;

import io.micronaut.core.annotation.Introspected;

import java.util.List;

@Introspected
public class Pokemon {
    String name;
    List<String> type;

    public Pokemon(String name, List<String> type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }
}
