package fr.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private final String name;
    private final Map<String, String> translations;
    private HashMap<String, List<String>> translationsMultiple;

    public Dictionary(String example) {
        this.name = "Example";
        this.translations = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public boolean isEmpty() {
        return this.translations.isEmpty();
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
        return "Ce mot n'existe pas dans le dictionnaire";
    }

    public void addMultipleTranslation(String contre, List<String> liste) {
        translationsMultiple.put(contre, liste);

    }

    public List getMultipleTranslation(String contre) {
        return translationsMultiple.get(contre);
    }
}
