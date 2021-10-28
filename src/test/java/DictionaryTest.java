import fr.main.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DictionaryTest {
    private Dictionary dict;

    @Test
    public void testDictionaryName() {
        dict = new Dictionary();
        assertThat(dict.getName(), equalTo("Example"));
    }
}
