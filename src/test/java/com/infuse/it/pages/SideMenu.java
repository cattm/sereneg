package com.infuse.it.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class SideMenu extends PageObject {
    /* this side menu is on every view we can either manage as object
     in other pages or instantiate in its own right
     it should contain ALL the items on the side menu
    */
    @FindBy(id = "n-mainpage-text")
    private WebElementFacade mainPage;

    public void click_main_page() {
        mainPage.click();
    }
}
