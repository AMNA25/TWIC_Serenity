package serenity.twic.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import tasks.profile.ChangePassword;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PasswordChange {
    @Given("User logins with {word} and {word}")
    public void user_logins_with_email_and_password(String email, String password) {
        theActorInTheSpotlight().attemptsTo(tasks.PositiveLogin.positiveLogin(email, password));
    }

    @When("User enters {word}, {word} and {word} password")
    public void user_changes_password(String oldP, String newP, String confirmP) {
        theActorInTheSpotlight().attemptsTo(ChangePassword.updatePassword(oldP, newP, confirmP));
    }

    @Then("password should be changed")
    public void password_should_be_changed() {
        theActorInTheSpotlight().wasAbleTo(Ensure.that(Text.of(components.profile.PasswordChange.SUCCESS_MESSAGE).asAString()
                .answeredBy(theActorInTheSpotlight())).isEqualTo("Password updated successfully"));
    }
}
