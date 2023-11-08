package com.infuse.it.steps;

import com.infuse.it.steps.actions.EndUserSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {

    @Steps
    EndUserSteps anna;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        anna.isTheHomePage();
    }

    @When("the user looks up the definition of the word {string}")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        anna.looksFor(word);
    }

    @Then("they should see the definition {string}")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        anna.shouldSeeDefinition(definition);
    }

}
