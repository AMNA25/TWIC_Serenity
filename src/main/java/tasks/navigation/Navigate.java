package tasks.navigation;

import components.HomePage;
import components.SettingsPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class Navigate {
    public static Task toProfilePage() {
        return Task.where("{0} navigates to profile page",
                Click.on(HomePage.SETTINGS_TAB),
                Click.on(SettingsPage.PROFILE));
    }
}
