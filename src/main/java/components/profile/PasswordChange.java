package components.profile;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class PasswordChange {
    public static Target OLD_PASSWORD = Target.the("old password")
            .located(MobileBy.AccessibilityId("old-password"));
    public static Target NEW_PASSWORD = Target.the("new password")
            .located(MobileBy.AccessibilityId("new-password"));
    public static Target CONFIRM_NEW_PASSWORD = Target.the("confirm new password")
            .located(MobileBy.AccessibilityId("confirm-password"));
    public static Target SAVE_PASSWORD = Target.the("save password button")
            .located(MobileBy.AccessibilityId("change-password-save-button"));
    public static Target SUCCESS_MESSAGE = Target.the("success message")
            .located(MobileBy.AccessibilityId("success-message"));
}
