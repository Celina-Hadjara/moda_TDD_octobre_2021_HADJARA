package fr.main;

public class Dictionary {
    private String name;

    public Dictionary(String name) {
        this.name = "Example";
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
        return null;
    }
}
