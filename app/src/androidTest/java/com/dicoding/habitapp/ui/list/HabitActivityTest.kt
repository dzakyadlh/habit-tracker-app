package com.dicoding.habitapp.ui.list

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.dicoding.habitapp.R
import com.dicoding.habitapp.ui.add.AddHabitActivity
import org.junit.Before
import org.junit.Rule
import org.junit.Test

//TODO 16 : Write UI test to validate when user tap Add Habit (+), the AddHabitActivity displayed
class HabitActivityTest {

    @get:Rule
    val rule = IntentsTestRule(HabitListActivity::class.java)

    @Before
    fun setup() {
        ActivityScenario.launch(HabitListActivity::class.java)
    }

    @Test
    fun isAddHabitActivityDisplayed() {
        onView(withId(R.id.fab)).perform(click())
        intended(hasComponent(AddHabitActivity::class.java.name))
    }
}