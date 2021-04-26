package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static components.LoginPage.*;

public class Login {
    public static Task usingCredentials() {
        return Task.where("{0} logins the app" ,
                Click.on(MANUAL_SIGNIN),
                Enter.theValue("max@twic.ai").into(EMAIL_FIELD),
                Click.on(NEXT_BUTTON),
                Enter.theValue("foobar").into(PASSWORD_FIELD),
                Click.on(LOGIN_BUTTON));
    }
}
