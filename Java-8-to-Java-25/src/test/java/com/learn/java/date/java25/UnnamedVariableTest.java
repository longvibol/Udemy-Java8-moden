package com.learn.java.date.java25;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UnnamedVariableTest {

    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testGetIntegerJava25_withValidNumber_returnsInteger() throws Exception {
        Method m = UnnamedVariable.class.getDeclaredMethod("getIntegerJava25", String.class);
        m.setAccessible(true);

        Integer result = (Integer) m.invoke(null, "123");

        assertNotNull(result);
        assertEquals(123, result.intValue());
    }

    @Test
    void testGetIntegerJava25_withInvalidNumber_returnsNullAndPrintsMessage() throws Exception {
        Method m = UnnamedVariable.class.getDeclaredMethod("getIntegerJava25", String.class);
        m.setAccessible(true);

        Integer result = (Integer) m.invoke(null, "Hello");

        assertNull(result);
        String printed = outContent.toString().trim();
        assertTrue(printed.contains("Failed to parse: Hello"));
    }

}
