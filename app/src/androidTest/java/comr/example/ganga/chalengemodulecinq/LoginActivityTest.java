package comr.example.ganga.chalengemodulecinq;

import android.support.test.rule.ActivityTestRule;

import com.example.ganga.chalengemodulecinq.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by GANGA on 22/03/2018.
 */

public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> activityActivityTestRule=new ActivityTestRule<LoginActivity>(LoginActivity.class);
    private LoginActivity loginActivity;

    @Before
    public void setUp() throws Exception {
        loginActivity=activityActivityTestRule.getActivity();
    }

    @Test
    public  void testActivity(){

        assertNotNull(loginActivity.findViewById(R.id.tv_email));
        assertNotNull(loginActivity.findViewById(R.id.tv_password));
        assertNotNull(loginActivity.findViewById(R.id.btn_login));

        onView(withId(R.id.tv_email)).perform(typeText("ganga@gmail.com")).toString();

        onView(withId(R.id.tv_password)).perform(typeText("ghost123"));

        onView(withId(R.id.btn_login)).perform(click());

        pressBack();
    }

    @After
    public void tearDown() throws Exception {
        loginActivity=null;
    }

}