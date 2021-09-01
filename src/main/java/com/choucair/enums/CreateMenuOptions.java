package com.choucair.enums;

public enum CreateMenuOptions {


    WOMEN("Women");

    private final String text;

    CreateMenuOptions(String text) {
        this.text = text;
    }

    public String asString() {
        return text;
    }
}
