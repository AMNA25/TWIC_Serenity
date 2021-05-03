package serenity.twic.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import tasks.profile.ChangeAddress;
import tasks.navigation.Navigate;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Address {
    @Given("User is on profile page")
    public void user_is_on_profile_page() {
        theActorInTheSpotlight().wasAbleTo(Navigate.toProfilePage());
    }

    @When("User fills address form with {word}, {word}, {string}, {word} and {word}")
    public void user_fills_address_form(String l1, String l2, String c, String z, String s) {
        theActorInTheSpotlight().attemptsTo(ChangeAddress.addressUpdate(l1, l2, c, z, s));
    }

    @Then("address should get updated")
    public void address_should_get_updated() {
        theActorInTheSpotlight().wasAbleTo(Ensure.that(Text.of(components.profile.Address.SUCCESS_MESSAGE).asAString()
                .answeredBy(theActorInTheSpotlight())).isEqualTo("Address updated successfully!"));
    }
}
