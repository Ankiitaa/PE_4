package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordReverseTest {
    WordReverse wr=new WordReverse();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void wordReverse() {
        assertEquals("ym eman si atikna", wr.wordReverse("My name is ankita"));
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god", wr.wordReverse("a quick brown fox jumps over the lazy dog"));
        assertNull("",wr.wordReverse(""));
    }
    @Test
    public void wordReverseFailure() {
        assertNotEquals("ym eman si atikna", wr.wordReverse("My name is ankita hegde"));
        assertNotNull(wr.wordReverse("my name"));
    }
}