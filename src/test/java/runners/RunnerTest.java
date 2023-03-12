package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( //опции
        features = "src/test/java/features",
        glue ={"steps"}
)
public class RunnerTest {

}
