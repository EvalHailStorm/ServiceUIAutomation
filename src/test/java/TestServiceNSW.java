import Base.TestBase;
import Pages.HomePage;
import Pages.Location;
import org.junit.After;
import java.io.IOException;

public class TestServiceNSW extends  TestBase{

    HomePage homePage = new HomePage();
Location searchLocation = new Location();
    public TestServiceNSW(){
        super();
    }

    //@Test
    public void testSearch() throws IOException, InterruptedException {
        homePage
                .search()
                .ValidateSearch();
    }

    //@Test
    public void testSearchServiceCenter() throws IOException, InterruptedException {
        homePage.ClickFindLocation();
        searchLocation.search("Sydney 2000").ValidateSearchResult("Marrickville Service Centre");
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

