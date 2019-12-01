package Pages;


import Base.TestBase;
import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id='globalAutosuggest']/input")
    WebElement txtSearch;

    @FindBy(xpath = "//button[@aria-label='Search']")
    WebElement btnSearch;

    @FindBy(xpath = "//*[@id='search']/div/div[1]")
    WebElement searchResult;

    @FindBy(xpath = "//*[@id='block-global-header-menu']/div/ul/li[3]/a")
    WebElement findLocation;



    public HomePage search()
    {
        txtSearch.sendKeys("Apply for a number plate");
        btnSearch.click();
        return this;
    }

    public HomePage ValidateSearch()
    {
        Assert.assertThat(searchResult.getText(),  StringContains.containsString("results found for ‘Apply for a number plate’"));
        return this;

    }

    public void ClickFindLocation()
    {
        findLocation.click();
        if(driver.getCurrentUrl() != "https://www.service.nsw.gov.au/service-centre")
        {
            driver.navigate().to("https://www.service.nsw.gov.au/service-centre");
        }

    }


}
