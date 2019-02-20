package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting s=new Sorting();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sorting() {
        assertEquals(new String[]{"based","is","on","sorting","this","words"},s.sorting("This is sorting based on words"));
        assertEquals(new String[]{"abc","xyz"},s.sorting("xyz abc"));
        assertNull("", s.sorting(""));
    }
    @Test
    public void sortingFailure() {
        assertNotEquals(new String[]{"based","is","sorting","this","words"},s.sorting("This is sorting based on words"));
        assertNotNull( s.sorting("sorting"));
    }
}