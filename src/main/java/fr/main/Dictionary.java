package fr.main;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private final String name;
    private final Map<String, String> translations;


    public Dictionary(String example) {
        this.name = "Example";
        this.translations = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public boolean isEmpty() {
        return translations == null;
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
