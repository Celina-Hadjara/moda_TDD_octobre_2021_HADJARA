package fr.test;

import fr.main.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DictionaryTest {
    private Dictionary dict;

    public DictionaryTest() {
        this.dict = new Dictionary("Example");
    }

    @Before
    public void initialize () {
        dict = new Dictionary("Example");
    }
    @Test
    public void testDictionaryName() {
        dict = new Dictionary("Example");
        assertThat(dict.getName(), equalTo("Example"));
    }

    @Test
    public void estVide(){
        assertThat(dict.isEmpty(), equalTo(true));
    }

    @Test public void testOneTranslation() {
        dict.addTranslation("contre", "against");
        assertThat(dict.getTranslation("contre"), equalTo("against"));
    }

    @Test public void testOneTranslation2() {
        dict.addTranslation("demain", "tomorrow");
        assertThat(dict.getTranslation("demain"), equalTo("tomorrow"));
    }

    @After
    public void reset(){
        dict = null;
    }
}
