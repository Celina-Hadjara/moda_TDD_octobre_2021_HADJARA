package fr.test;

import fr.main.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class DictionaryTest {
    private Dictionary dict;
    private List<String> liste;

    public DictionaryTest() {
    }

    @Before
    public void initialize() {
        dict = new Dictionary("Example");
        liste = new ArrayList<>();
    }

    @Test
    public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }

    @Test
    public void estVide() {
        assertThat(dict.isEmpty(), equalTo(true));
    }

    @Test
    public void testOneTranslation() {
        dict.addTranslation("contre", "against");
        assertThat(dict.getTranslation("contre"), equalTo("against"));
    }

    @Test
    public void testOneTranslation2() {
        dict.addTranslation("demain", "tomorrow");
        assertThat(dict.getTranslation("demain"), equalTo("tomorrow"));
    }

    @Test
    public void testOneTranslation3() {
        liste.add("deux");
        liste.add("two");
        assertThat(liste, containsInAnyOrder("deux", "two"));
    }

    @After
    public void reset() {
        dict = null;
    }
}
