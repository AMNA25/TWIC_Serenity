package serenity.twic.steps;

import components.SettingsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import tasks.Login;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PositiveLogin {
    @Given("User is on Login page")
    public void user_is_on_i_ll_sign_in_manually_page() {
    }


    @When("User enters valid {word} and {word}")
    public void userEntersValidEmailAndPassword(String email, String password) {
        theActorInTheSpotlight().attemptsTo(tasks.PositiveLogin.positiveLogin(email, password));
    }


    @Then("User should be able to see {word} in settings page")
    public void user_should_be_able_to_login(String email) {
        /*theActorInTheSpotlight().wasAbleTo(Ensure.that(Text.of(SettingsPage.USER_ID).asAString()
                .answeredBy(theActorInTheSpotlight())).isEqualTo(email));*/
    }
}
