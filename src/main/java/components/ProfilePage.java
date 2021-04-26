package components;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import net.serenitybdd.screenplay.targets.Target;


public class ProfilePage {

    public static Target ADDRESS_LINE_1_FIELD = Target.the("addressfield 1")
            .located(MobileBy.xpath("//android.widget.TextView[@text='Address Line 1']//following-sibling::android.view.ViewGroup/android.widget.EditText"));
    public static Target ADDRESS_LINE_2_FIELD = Target.the("address field 2")
            .locatedBy("//android.widget.TextView[@text='Address Line 2']//following-sibling::android.view.ViewGroup/android.widget.EditText");
    public static Target ZIP_CODE_FIELD = Target.the("zip code field")
            .locatedBy("//android.widget.TextView[@text='Zip Code']/following-sibling::android.view.ViewGroup/android.widget.EditText");
    public static Target CITY_FIELD = Target.the("city field")
            .locatedBy("//android.widget.TextView[@text='City']/following-sibling::android.view.ViewGroup/android.widget.EditText");
    public static Target SAVE_BUTTON = Target.the("save button")
            .locatedBy("//android.widget.TextView[@text='Save']");
}
