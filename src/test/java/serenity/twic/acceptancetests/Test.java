package serenity.twic.acceptancetests;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/" , glue = "serenity.twic" , tags = "@currentTest")
public class Test {

}
