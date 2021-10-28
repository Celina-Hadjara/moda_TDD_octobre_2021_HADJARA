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
        liste.add("against");
        dict.addTranslation("contre", "against");
        assertThat(liste, containsInAnyOrder("against"));
    }

    @Test
    public void testOneTranslation1() {
        liste.add("tomorrow");
        dict.addTranslation("demain", "tomorrow");
        assertThat(liste, containsInAnyOrder("tomorrow"));
    }

    @Test
    public void testOneTranslation2() {
        liste.add("against");
        liste.add("versus");
        assertThat(liste, containsInAnyOrder("against","versus"));
    }

    @After
    public void reset() {
        dict = null;
    }
}
