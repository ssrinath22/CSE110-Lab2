package edu.ucsd.cse110.lab2;

import static org.junit.Assert.assertEquals;

import android.widget.TextView;

import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class BetterMainActivityTest {

    @Test
    public void test_one_plus_one_equals_two() {
        var scenario = ActivityScenario.launch(MainActivity.class);
        scenario.moveToState(Lifecycle.State.CREATED);
        scenario.moveToState(Lifecycle.State.CREATED);

        scenario.onActivity(activity -> {
            activity.findViewById(R.id.btn_one).performClick();
            activity.findViewById(R.id.btn_plus).performClick();
            activity.findViewById(R.id.btn_one).performClick();
            activity.findViewById(R.id.btn_equals).performClick();
            TextView display = activity.findViewById(R.id.display);
            assertEquals("2",display.getText());
        });
    }


}
