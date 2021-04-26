package serenity.twic.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.TextOf;
import tasks.Change;
import tasks.Navigate;

import java.util.List;
import java.util.Map;

import static components.ProfilePage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ChangeAddress {
    @Given("User is on the profile page")
    public void user_is_on_the_profile_page() {
        theActorInTheSpotlight().wasAbleTo(Navigate.toProfilePage());
    }

    @When("User changes the address")
    public void user_changes_the_address(DataTable table){
        List<Map<String, String>> updatedAddress = table.asMaps();
        theActorInTheSpotlight().attemptsTo(Change.addressUsing(updatedAddress.get(0)));
    }

    @Then("The first address line should be equal to {word}")
    public void The_first_address_line_should_be_equal_to_addressLine1(String addressLine1){
        theActorInTheSpotlight().wasAbleTo(
                Ensure.that(TextOf.theFieldNamed(ADDRESS_LINE_1_FIELD).answeredBy(theActorInTheSpotlight())).contains(addressLine1)
        );
    }

    @And("The second address line should be equal to {word}")
    public void The_second_address_line_should_be_equal_to_addressLine2(String addressLine2){
        theActorInTheSpotlight().wasAbleTo(
                Ensure.that(TextOf.theFieldNamed(ADDRESS_LINE_2_FIELD).answeredBy(theActorInTheSpotlight())).contains(addressLine2)
        );
    }

    @And("The zipcode field should be equal to {int}")
    public void The_zipcode_field_should_be_equal_to_zipcode(Integer zipcode){
        theActorInTheSpotlight().wasAbleTo(
                Ensure.that(TextOf.theFieldNamed(ZIP_CODE_FIELD).answeredBy(theActorInTheSpotlight())).isEqualTo(zipcode.toString())
        );
    }

    @And("The city field should be equal to {word}")
    public void The_city_field_should_be_equal_to_city(String city){
        theActorInTheSpotlight().wasAbleTo(
                Ensure.that(TextOf.theFieldNamed(CITY_FIELD).answeredBy(theActorInTheSpotlight())).isEqualTo(city)
        );
    }
}
