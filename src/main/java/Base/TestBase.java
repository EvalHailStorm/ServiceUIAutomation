package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
    public static WebDriver driver;

    public  TestBase(){

        String Url = "https://www.service.nsw.gov.au/";
        System.setProperty("webdriver.chrome.driver",  "WebDriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get(Url);


    }

}
