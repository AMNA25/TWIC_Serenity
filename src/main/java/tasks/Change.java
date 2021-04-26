package tasks;

import interactions.ScrollDown;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static components.ProfilePage.*;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Change {
    private static WebDriver driver;

    public static Task addressUsing(Map<String, String> updatedAddress) {
        return Task.where("{0} edit the address",
                Enter.theValue(updatedAddress.get("addressLine1")).into(ADDRESS_LINE_1_FIELD),
                ScrollDown.currentPage(),
                Enter.theValue(updatedAddress.get("addressLine2")).into(ADDRESS_LINE_2_FIELD),
                Enter.theValue(updatedAddress.get("zipCode")).into(ZIP_CODE_FIELD),
                Enter.theValue(updatedAddress.get("city")).into(CITY_FIELD),
                Click.on(SAVE_BUTTON)
                );
    }
}
