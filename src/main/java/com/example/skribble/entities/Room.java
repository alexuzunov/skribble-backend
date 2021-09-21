package com.example.skribble.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room {
    @Id
    private String id;

    private String host;
    private Integer rounds;
    private Integer drawTime;
    private String dictionary;
    private String customWords;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getRounds() {
        return rounds;
    }

    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }

    public Integer getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(Integer drawTime) {
        this.drawTime = drawTime;
    }

    public String getDictionary() {
        return dictionary;
    }

    public void setDictionary(String dictionary) {
        this.dictionary = dictionary;
    }

    public String getCustomWords() {
        return customWords;
    }

    public void setCustomWords(String customWords) {
        this.customWords = customWords;
    }
}
