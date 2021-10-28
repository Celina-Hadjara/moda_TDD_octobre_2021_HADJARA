import fr.main.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DictionaryTest {
    private Dictionary dict;

    @Before
    public void initialize () {
        dict = new Dictionary();
    }

    @Test
    public void testDictionaryName() {
        dict = new Dictionary();
        assertThat(dict.getName(), equalTo("Example"));
    }

    @Test
    public void estVide(){
        assertThat(dict.isEmpty(), equalTo(true));
    }

    @After
    public void reset(){
        dict = null;
    }
}
