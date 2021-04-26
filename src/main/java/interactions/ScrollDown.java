package interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ScrollDown
//        implements Interaction
{

    public ScrollDown(){}
    public static Performable currentPage(){
        return Task.where("scrolls screen down", actor -> {
            Dimension dimension = BrowseTheWeb.as(actor).getDriver().manage().window().getSize();

//            int abc = Integer.getInteger(Double.toString(dimension.height * .2));

        int startX = (int) (dimension.width * 0.2);
        int startY = (int) (dimension.height * 0.9);
        int endX = (int) (dimension.width * 0.2);
        int endY = (int) (dimension.height * 0.2);

        TouchAction touch = new TouchAction(((AppiumDriver)((WebDriverFacade) getDriver()).getProxiedDriver()));
        touch.press(PointOption.point(startX , startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endX , endY)).release().perform();
        });
    }
//    public static ScrollDown currentPage(){
//        return Instrumented.instanceOf(ScrollDown.class).withProperties();
//    }
//
//    @Override
//    public <T extends Actor> void performAs(T actor) {
//        Dimension dimension = BrowseTheWeb.as(actor).getDriver().manage().window().getSize();
//        int startX = (int) (dimension.width * 0.2);
//        int startY = (int) (dimension.height * 0.8);
//        int endX = (int) (dimension.width * 0.2);
//        int endY = (int) (dimension.height * 0.2);
//
//        TouchAction touch = new TouchAction();
//        touch.press(PointOption.point(startX , startY))
//                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//                .moveTo(PointOption.point(endX , endY)).release().perform();
//    }
}
