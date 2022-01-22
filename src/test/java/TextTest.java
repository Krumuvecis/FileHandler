import fileHandler.FileHandler;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextTest {

    private static final String
            DIRECTORY = "resources",
            READ_TEST_FILE_NAME = "textReadTest",
            WRITE_TEST_FILE_NAME = "textWriteTest";

    @BeforeAll
    static void initialize() {
        //set common variables
    }

    /**
     * Tests file path creation.
     * TODO: move to another class
     */
    @Test
    void pathTest() {
        String dir = "dir", slash = "/", file = "file";
        String expected = dir + slash + file;
        String actual = FileHandler.path(dir, file);
        assertEquals(expected, actual, "Not creating file path correctly.");
    }

    /**
     * Tests file existence check.
     * TODO: move to another class
     */
    @Test
    void fileExistenceCheckTest() {
        //check file existence
        //TODO: make this test
        assertEquals(true, false, "File existence check test not working.");
    }

    /**
     * Tests reading of lines.
     */
    @Test
    void readLines() {
        String
                line1 = "row1 : data1",
                line2 = "row2 : data2",
                line3 = "row3 : data3a data3b data3c";

        ArrayList<String> expected = new ArrayList<>() {{
            add(line1);
            add(line2);
            add(line3);
        }};

        //read text lines from preprepared file
        ArrayList<String> actual = FileHandler.readLines(FileHandler.path(DIRECTORY, READ_TEST_FILE_NAME));

        assertEquals(expected, actual,"Not reading lines of text.");
    }

    /**
     * Tests converting read lines from ArrayList of String to ArrayList of String[].
     */
    @Test
    void stringArrayArrayListTest() {
        String[]
                line1 = new String[] {"row1", "data1"},
                line2 = new String[] {"row2", "data2"},
                line3 = new String[] {"row3", "data3a", "data3b", "data3c"};

        ArrayList<String[]> expected = new ArrayList<>() {{
            add(line1);
            add(line2);
            add(line3);
        }};

        //convert read text lines to arrays of strings
        ArrayList<String[]> actual = FileHandler.readSeparatedLines(FileHandler.path(DIRECTORY, READ_TEST_FILE_NAME));;

        assertEquals(expected, actual, "Not converting read lines to string arrays.");
    }

    /**
     * Tests converting read lines from ArrayList<String[]> to HashMap<String, String[]>.
     */
    @Test
    void stringArrayMapTest() {
        String
                key1 = "row1",
                key2 = "row2",
                key3 = "row3";

        String[]
                value1 = new String[] {"data1"},
                value2 = new String[] {"data2"},
                value3 = new String[] {"data3a", "data3b", "data3c"};

        HashMap<String, String[]> expected = new HashMap<>() {{
            put(key1, value1);
            put(key2, value2);
            put(key3, value3);
        }};

        //convert read text lines to map of string arrays
        HashMap<String, String[]> actual = FileHandler.readStringArrayMap(FileHandler.path(DIRECTORY, READ_TEST_FILE_NAME));;

        assertEquals(expected, actual, "Not converting read lines to map of string arrays.");
    }

    @Test
    void writeTest() {
        //generate file and write text
        //TODO: make this test
        assertEquals(true, false, "Write test not working.");
    }

    @Test
    void rereadTest() {
        //read text from generated file
        //TODO: make this test
        assertEquals(true, false, "Reread test not working.");
    }
}