package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NamePresenceTest {
    NamePresence np=new NamePresence();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void namePresence() {
        assertEquals(true,np.namePresence("This is Harry"));
        assertEquals(false,np.namePresence("This is Henry"));
    }
    @Test
    public void namePresenceFailure() {
        assertNotEquals(true,np.namePresence("This is Henry"));
        assertNotNull(np.namePresence("This is Henry"));

    }
}