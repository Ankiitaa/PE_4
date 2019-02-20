package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceTest {
    Occurence oc=new Occurence();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void occurence() {
        assertEquals(10,oc.occurence("Java is java again java again", 'a'));
        assertEquals(3,oc.occurence("Java is java again java again", 'j'));
        assertEquals(5,oc.occurence("Java is java again java again", ' '));

    }
    @Test
    public void occurenceFailure() {
        assertNotEquals(5,oc.occurence("Java is java again java again", 'a'));
        assertNotNull(oc.occurence("Java is java again java again", ' '));

    }
}