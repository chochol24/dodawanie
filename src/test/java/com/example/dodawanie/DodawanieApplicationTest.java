package com.example.dodawanie;

import junit.framework.TestCase;

public class DodawanieApplicationTest extends TestCase {

    public void testAdded() {
        DodawanieApplication dodawanieApplication = new DodawanieApplication();
        assertEquals(10, dodawanieApplication.added(4,6));
    }
}