package tasks.profile;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromBy;
import org.openqa.selenium.WebDriver;

import static components.profile.Address.*;

public class ChangeAddress {
    private static WebDriver driver;

    public static Task addressUpdate(String l1, String l2, String c, String z, String s) {
        return Task.where("{0} edit the address",
                Enter.theValue(l1).into(ADDRESS_LINE_1_FIELD),
                Scroll.to(SAVE_BUTTON),
                //ScrollDown.currentPage(),
                Enter.theValue(l2).into(ADDRESS_LINE_2_FIELD),
                Enter.theValue(z).into(ZIP_CODE_FIELD),
                Enter.theValue(c).into(CITY_FIELD),
                Click.on(STATE),
                new SelectByVisibleTextFromBy(s),
                Click.on(SAVE_BUTTON)
        );
    }
}
