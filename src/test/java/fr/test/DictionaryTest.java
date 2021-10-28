package fr.test;

import fr.main.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

//@ExtendWith(MockitoExtension.class)
public class DictionaryTest {
    @Mock
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
    public void testOneTranslation2() {
        liste.add("tomorrow");
        dict.addTranslation("demain", "tomorrow");
        assertThat(liste, containsInAnyOrder("tomorrow"));
    }

    @Test
    public void testMultipleTranslation() {
        dict.addTranslation("contre", "against");
        dict.addTranslation("contre", "versus");
        List<String> laListe = dict.getTranslation("contre");
        assertThat(laListe, containsInAnyOrder("against","versus"));
    }

    @Test
    public void testinverseTranslation(){
        dict.addTranslation("contre", "against");
        dict.addTranslation("contre", "versus");
        dict.addTranslation("against", "contre");
        dict.addTranslation("versus", "contre");
        List<String> laListe = dict.getTranslation("contre");
        assertThat(laListe, containsInAnyOrder("against","versus","contre"));
    }

    @After
    public void reset() {
        dict = null;
    }
}
