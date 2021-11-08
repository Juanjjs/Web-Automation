package co.com.choucair.certification.newexperience.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login_compra.feature",
        glue = "co.com.choucair.certification.newexperience.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class Compra {

}

