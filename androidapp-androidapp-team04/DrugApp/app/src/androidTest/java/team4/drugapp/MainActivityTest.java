package team4.drugapp;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static team4.drugapp.R.id.ManageDrugs_btn;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void ManageDrugsClickTest(){

        onView(withId(R.id.ManageDrugs_btn)).perform(click());
    }

    @Test
    public void AlarmsClickTest(){

        onView(withId(R.id.Alarms_Btn)).perform(click());
    }

    @Test
    public void DrugDictionaryClickTest(){

        onView(withId(R.id.DrugDictionary_Btn)).perform(click());
    }

    @Test
    public void SettingsClickTest(){

        onView(withId(R.id.Settings_Btn)).perform(click());
    }

    //pressBack();
}
