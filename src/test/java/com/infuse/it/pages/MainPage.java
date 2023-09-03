package com.infuse.it.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class MainPage extends PageObject {
    // Add page view specific identifiers and methods

    /* to demonstrate the use - compare the text in the first paragraph
    Welcome to the English-language Wiktionary, a collaborative project to produce a free-content multilingual dictionary.
    It aims to describe all words of all languages using definitions and descriptions in English.
     */

    @FindBy(css="table#main_page_mp_mp body tr td div #text")
    private WebElementFacade firstPara;



    public String return_first_para() {
        return firstPara.getText();
    }
}
