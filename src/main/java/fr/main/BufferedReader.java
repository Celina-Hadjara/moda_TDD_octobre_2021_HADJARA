package fr.main;

import java.io.IOException;
import java.io.Reader;

public class BufferedReader {
    private ILineReader reader;

    public BufferedReader(Reader in) {
    }

    public String readLine() throws IOException {
        return reader.readLine();
    }
}
