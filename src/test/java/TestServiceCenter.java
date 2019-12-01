import Base.TestBase;
import Pages.HomePage;
import Pages.Location;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TestServiceCenter extends  TestBase{

    HomePage homePage = new HomePage();
    Location searchLocation = new Location();
    private String location;
    private String ServiceCentre;

    public TestServiceCenter(String location, String ServiceCentre){
        super();
        this.location = location;
        this.ServiceCentre = ServiceCentre;
    }


    @Parameterized.Parameters
    public static List<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {"Sydney 2000", "Marrickville Service Centre"},
                {"Sydney Domestic Airport 2020", "Rockdale Service Centre"}
        });
    }




    @Test
    public void testSearchServiceCenter() throws IOException, InterruptedException {
        homePage.ClickFindLocation();
        searchLocation.search(location).ValidateSearchResult(ServiceCentre);
    }






    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

