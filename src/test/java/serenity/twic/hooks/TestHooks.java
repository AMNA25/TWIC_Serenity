package serenity.twic.hooks;

import components.ProfilePage;
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
    private Actor bjorn;

    @Managed
    protected AppiumDriver<MobileElement> driver;

    @Before
    public void bjornCanUseTheApp(){
        OnStage.setTheStage(new OnlineCast());
        bjorn = OnStage.theActorCalled("Bjorn");
        theActorInTheSpotlight().wasAbleTo(Login.usingCredentials());
    }
}
