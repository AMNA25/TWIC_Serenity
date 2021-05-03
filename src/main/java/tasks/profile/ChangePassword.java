package tasks.profile;

import components.profile.PasswordChange;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ChangePassword {
    public static Task updatePassword(String oldP, String newP, String confirmP) {
        return Task.where("User changes the password",
                Enter.theValue(oldP).into(PasswordChange.OLD_PASSWORD),
                Enter.theValue(newP).into(PasswordChange.NEW_PASSWORD),
                Enter.theValue(confirmP).into(PasswordChange.CONFIRM_NEW_PASSWORD),
                Click.on(PasswordChange.SAVE_PASSWORD)
        );
    }
}
