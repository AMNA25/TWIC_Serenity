package serenity.twic.hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import tasks.Login;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TestHooks {
    private Actor Amna;

    @Managed
    protected AppiumDriver<MobileElement> driver;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        Amna = OnStage.theActorCalled("Amna");
      //  theActorInTheSpotlight().wasAbleTo(Login.usingCredentials());
    }
}
