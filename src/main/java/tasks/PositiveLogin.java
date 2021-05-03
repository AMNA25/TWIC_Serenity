package tasks;

import components.HomePage;
import components.LoginPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class PositiveLogin {
    public static Task positiveLogin(String email, String password){
        return Task.where("{0} enters valid credentials",
                Click.on(LoginPage.MANUAL_SIGNIN),
                Enter.theValue(email).into(LoginPage.EMAIL_FIELD),
                Click.on(LoginPage.NEXT_BUTTON),
                Enter.theValue(password).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON),
                Click.on(HomePage.SETTINGS_TAB)
        );
    }
}
