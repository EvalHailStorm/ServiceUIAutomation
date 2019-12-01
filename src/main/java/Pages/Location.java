package Pages;

import Base.TestBase;
import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Location extends TestBase {

    public Location() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id='locatorTextSearch']")
    WebElement txtSearchLocator;

    @FindBy(xpath = "//form[@class='locator__search']//button[@aria-label='Search']")
    WebElement btnSearch;

    @FindBy(xpath = "//*[@id='locatorListView']/div/div/div")

    WebElement txtSearchResult;


    public Location search(String searchKeyword) {
        txtSearchLocator.sendKeys(searchKeyword);
        btnSearch.click();

        return this;
    }

    public void ValidateSearchResult(String keyword) {
        Assert.assertThat(txtSearchResult.getText(), StringContains.containsString(keyword));
    }
}

