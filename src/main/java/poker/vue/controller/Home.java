package poker.vue.controller;

import poker.controller.Controlleur;
import poker.vue.Vue;

public class Home implements Vue {
    private Controlleur controlleur;

    @Override
    public void setController(Controlleur controlleur) {
        this.controlleur=controlleur;
    }
}
