package components;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static Target MANUAL_SIGNIN = Target.the("Manual sign in button")
            .located(MobileBy.AccessibilityId("sign-in-manually"));

    public static Target EMAIL_FIELD = Target.the("Enter email field")
            .located(MobileBy.AccessibilityId("work-email-field"));
    public static Target NEXT_BUTTON = Target.the("Next button")
            .located(MobileBy.AccessibilityId("work-email-button"));

    public static Target PASSWORD_FIELD = Target.the("password field")
            .located(MobileBy.AccessibilityId("password-field"));

    public static Target LOGIN_BUTTON = Target.the("login button")
            .located(MobileBy.AccessibilityId("login-button"));
}
