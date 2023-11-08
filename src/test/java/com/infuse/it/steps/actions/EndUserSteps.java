package com.infuse.it.steps.actions;

import com.infuse.it.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void startsSearch() {
        dictionaryPage.lookupTerms();
    }

    @Step
    public void shouldSeeDefinition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void isTheHomePage() {
        dictionaryPage.open();
    }

    @Step
    public void looksFor(String term) {
        enters(term);
        startsSearch();
    }
}