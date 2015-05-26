package com.example.treetha.myapplication;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by treetha on 5/25/15.
 */
@RunWith(AndroidJUnit4.class)
public class HelloEspressoTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);


    @Test
    public void convert_temperator_from_C_should_32_F(){
        onView(withId(R.id.c_text)).perform(typeText("0"));
        onView(withId(R.id.f_text)).check(matches(withText("32.0")));
    }

    @Test
    public void convert_temperator_from_F_should_0_C(){
        onView(withId(R.id.f_text)).perform(typeText("32"));
        onView(withId(R.id.c_text)).check(matches(withText("0.0")));
    }

}
