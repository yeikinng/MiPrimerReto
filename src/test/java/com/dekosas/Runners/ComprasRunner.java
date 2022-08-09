package com.dekosas.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/compras.feature",
        glue = "com.dekosas.StepDefintions",
        snippets = SnippetType.CAMELCASE)


public class ComprasRunner {


}
