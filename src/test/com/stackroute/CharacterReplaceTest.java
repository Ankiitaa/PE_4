package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterReplaceTest {
    CharacterReplace cr=new CharacterReplace();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void characterReplace() {
        assertEquals("faity fry",cr.characterReplace("daily dry"));
        assertEquals("tong",cr.characterReplace("long"));
        assertEquals("ankita",cr.characterReplace("ankita"));
        assertNull("",cr.characterReplace(""));

    }
    @Test
    public void characterReplaceFailure() {
        assertNotEquals("faity fry",cr.characterReplace("daily"));
        assertNotNull(cr.characterReplace("ankita"));

    }
}