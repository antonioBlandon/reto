package co.com.bancolombia.certificacion.retoaliados.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.com.bancolombia.certificacion.retoaliados.stepdefinitions",
        features = "src/test/resources/features/searchfile.feature",
        snippets = SnippetType.CAMELCASE
)
public class SearchFlyRunner {
}
