package com.example.junit;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityUnitTest extends TestCase {

    //create test environment
    @Override
    @Before
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testvalidateEmail() {
        assertTrue(MainActivity.validateEmail("hamza@gmail.com"));
    }

    @Test
    public void testvalidatePassword() {
        assertTrue(MainActivity.validatePassword("passWord"));
    }

    @Override
    @After
    protected void tearDown() throws Exception {
        super.tearDown();
    }

}