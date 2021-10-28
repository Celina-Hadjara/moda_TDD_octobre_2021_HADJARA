package fr.main;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private String name;
    Map<String, String> translations;

    public Dictionary(String name) {
        this.name = "Example";
        this.translations = new HashMap<>();
    }

    public Dictionary() {
        this.name = "Example";
    }

    public String getName() {
        return this.name;
    }

    public boolean isEmpty() {
        return true;
    }

    public void addTranslation(String contre, String against) {
    }

    public String getTranslation(String contre) {
        return "against";
    }
}
