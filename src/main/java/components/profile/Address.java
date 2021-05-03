package components.profile;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import net.serenitybdd.screenplay.targets.Target;


public class Address {

    public static Target ADDRESS_LINE_1_FIELD = Target.the("address field 1")
            .located(MobileBy.AccessibilityId("line1"));
    public static Target ADDRESS_LINE_2_FIELD = Target.the("address field 2")
            .located(MobileBy.AccessibilityId("line2"));
    public static Target ZIP_CODE_FIELD = Target.the("zip code field")
            .located(MobileBy.AccessibilityId("zip"));
    public static Target CITY_FIELD = Target.the("city field")
            .located(MobileBy.AccessibilityId("city"));
    public static Target STATE = Target.the("state")
            .locatedBy("//android.widget.EditText[@content-desc=\"zip\"]//following::android.widget.EditText");
   // public static Target STATE_NAME = Target.the("state name")
           // .located(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\""+state+"\"));"));
    public static Target SAVE_BUTTON = Target.the("save button")
            .located(MobileBy.AccessibilityId("change-address-save-button"));
    public static Target SUCCESS_MESSAGE = Target.the("success message")
            .located(MobileBy.AccessibilityId("message"));
}
