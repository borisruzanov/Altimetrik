package com.example.boris.altimetrik;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import java.util.Map;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;
import static org.junit.Assert.*;

public class MainActivityTest {


    //Prepare needed activity for testing
    @Rule
    public ActivityTestRule<MainActivity> mUserActivity = new ActivityTestRule<>(MainActivity.class);
    //    public IntentsTestRule<MainActivity> mMainActivity = new IntentsTestRule<>(MainActivity.class);
    @Test
    public void checkingPasswordEditTextWithSymbols() {
        Context context = InstrumentationRegistry.getContext();

        onView(withId(R.id.recycler_list_main)).perform(
                RecyclerViewActions.actionOnItemAtPosition(0, MyViewAction.clickChildViewWithId(R.id. bt_deliver)));


        //Get access to a method from that activity
//        mUserActivity.getActivity().isValidPassword("123");

        //Checking that snackbar appears
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText("Sequence of characters - Forbidden. Length 5-12 characters")))
                .check(matches(isDisplayed()));
    }

}