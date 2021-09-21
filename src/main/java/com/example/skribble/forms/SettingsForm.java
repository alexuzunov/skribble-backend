package com.example.skribble.forms;

public class SettingsForm {
    private String dictionary;
    private Integer drawTime;
    private Integer rounds;

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
}
