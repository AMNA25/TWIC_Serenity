package components;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class SettingsPage {
    public static Target PROFILE = Target.the("profile")
            .located(MobileBy.AccessibilityId("profile"));
    public static Target USER_ID = Target.the("user id")
            .located(MobileBy.AccessibilityId("user id"));
}
