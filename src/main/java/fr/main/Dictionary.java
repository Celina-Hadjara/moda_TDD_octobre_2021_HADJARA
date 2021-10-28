package fr.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dictionary implements IDictionary{
    private final String name;
    private HashMap<String, List<String>> translations;

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

    public void addTranslation(String contre, String against){
        if (!translations.containsKey(contre)) {
            List<String> noExiste= new ArrayList<String>();
            noExiste.add(against);
            translations.put(contre, noExiste);
        }else {
            List<String> existe= translations.get(contre);
            existe.add(against);
            translations.put(against, existe);
        }
    }

    public List getTranslation(String contre) {
        return this.translations.get(contre);
    }

}
