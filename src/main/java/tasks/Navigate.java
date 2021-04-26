package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static components.MainPage.PROFILE_BUTTON;
import static components.MainPage.SETTINGS_BUTTON;

public class Navigate {
    public static Task toProfilePage() {
        return Task.where("{0} navigates to profile page",
                Click.on(SETTINGS_BUTTON),
                Click.on(PROFILE_BUTTON));
    }
}
