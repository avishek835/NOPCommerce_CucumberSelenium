import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})
//@CucumberOptions(
//        features = {
//                    "E:/SELENIUM/Java_Selenium_Cucumber-master.zip_expanded/Java_Selenium_Cucumber-master/MainFeature/Login.feature"
//                    }
//        )
@CucumberOptions(
		 features = "Feature"
		 ,glue={"StepDefination"}
		 )
public class RunCucumberTest {

}
