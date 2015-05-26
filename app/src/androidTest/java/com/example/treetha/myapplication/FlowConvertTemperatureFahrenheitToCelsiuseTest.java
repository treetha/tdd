package com.example.treetha.myapplication;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by treetha on 5/26/15.
 */
@RunWith(Parameterized.class)
public class FlowConvertTemperatureFahrenheitToCelsiuseTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    private String fahrenheit;
    private String celsius;

    @Parameters
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"32","0.0"},{"64","17.77777777777778"}
        });
    }

    public FlowConvertTemperatureFahrenheitToCelsiuseTest(String fahrenheit,String celsius){
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    @Test
    public void convert(){
        onView(withId(R.id.f_text)).perform(typeText(this.fahrenheit));
        onView(withId(R.id.c_text)).check(matches(withText(this.celsius)));
    }

}
