package fr.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<String> returnList = null;
        for(Map.Entry<String, List<String>> entry : translations.entrySet()){
            if (contre.equals(entry.getValue())) {
                returnList.add(entry.getKey());
                return returnList;
            }
        }
        return this.translations.get(contre);
    }

}
