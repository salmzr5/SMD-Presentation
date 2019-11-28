package com.example.junit;

import android.widget.Button;
import android.widget.EditText;

import androidx.test.filters.SmallTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;


//For testing of single activity
public class MainActivityInstrumentationTest extends ActivityTestRule<MainActivity> {
    public MainActivityInstrumentationTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    @Before
    protected void setUp() throws Exception {
        setUp();
    }


    //smalltest doesn't interact with any file system or network.
    @SmallTest
    public void testEmailEdittext() {
        EditText et_email = getActivity().findViewById(R.id.et_email);
        assertNotNull(et_email);
    }

    @SmallTest
    public void testPasswordEdittext() {
        EditText et_password = getActivity().findViewById(R.id.et_password);
        assertNotNull(et_password);
    }

    @SmallTest
    public void testButton() {
        Button btn = getActivity().findViewById(R.id.btn_login);
        assertNotNull(btn);
    }

    @After
    protected void tearDown() throws Exception {
        tearDown();
    }

}
