package com.irfan.debuggingandunittesting;

import android.os.SystemClock;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class InstrumentTestingMain {

    private String inputText = "tester";

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void checkAllViewsIsValid_sameActivity() {
        onView(withId(R.id.etMain)).check(matches(isDisplayed()));
        onView(withId(R.id.btnToast)).check(matches(isDisplayed()));
        onView(withId(R.id.btnSnackbar)).check(matches(isDisplayed()));
    }

    @Test
    public void showToastActivity(){
        onView(withId(R.id.etMain)).perform(typeText(inputText));
        onView(withId(R.id.etMain)).perform(closeSoftKeyboard());
        onView(withId(R.id.btnToast)).perform(click());
        SystemClock.sleep(1000);
    }

    @Test
    public void showSnackbarActivity(){
        onView(withId(R.id.etMain)).perform(typeText(inputText));
        onView(withId(R.id.etMain)).perform(closeSoftKeyboard());
        onView(withId(R.id.btnSnackbar)).perform(click());
        SystemClock.sleep(1000);
    }
}
