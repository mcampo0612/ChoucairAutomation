package com.choucair.enums;

public enum ActorName {

    MIGUEL(2),
    FRANCY(3);

    private final int id;

    ActorName(int id) {
        this.id = id;
    }

    public int id() {
        return id;
    }
}
