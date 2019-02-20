package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MultipleOccurenceTest {
    MultipleOccurence mo=new MultipleOccurence();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void multipleOccurence() {
        assertEquals("Found at:4-6",mo.multipleOccurence("She sell","se"));
        assertEquals("Found at:0-3 Found at:4-7 Found at:8-11 Found at:16-19",mo.multipleOccurence("cat cat cat tie cat","cat"));
        assertNull(mo.multipleOccurence("","se"));
    }
    @Test
    public void multipleOccurenceFailure() {
        assertNotEquals("Found at:4-6 found at:7-8",mo.multipleOccurence("She sell","se"));
        assertNotEquals("Found at:0-3 Found at:4-7 Found at:8-11",mo.multipleOccurence("cat cat cat tie cat","cat"));
        assertNotNull(mo.multipleOccurence("cat cat cat","se"));
    }
}