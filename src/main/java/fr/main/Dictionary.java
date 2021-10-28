package fr.main;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private String name;
    private Map<String, String> translations;

    public Dictionary(String name) {
        this.name = "Example";
        this.translations = new HashMap<>();
    }

    public Dictionary() {
        this.name = "Example";
        this.translations = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public boolean isEmpty() {
        return true;
    }

    public void addTranslation(String contre, String against) {
        translations.put(contre, against);
    }

    public String getTranslation(String contre) {

        if (translations.containsKey(contre)) {
            return translations.get(contre);
        }
        if (translations.containsValue(contre)) {
            for (Map.Entry<String, String> entry : translations.entrySet()) {
                if (contre.equals(entry.getValue())) {
                    return entry.getKey();
                }
            }
        }
        return "N'existe pas";
    }
}
