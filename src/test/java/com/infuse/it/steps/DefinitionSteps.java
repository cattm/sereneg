package com.infuse.it.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

import com.infuse.it.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps anna;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        anna.is_the_home_page();
    }

    @When("the user looks up the definition of the word {string}")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        anna.looks_for(word);
    }

    @Then("they should see the definition {string}")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        anna.should_see_definition(definition);
    }

}
