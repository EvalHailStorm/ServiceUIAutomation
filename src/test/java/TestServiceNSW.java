import Base.TestBase;
import Pages.HomePage;
import Pages.Location;
import org.junit.After;
import org.junit.Test;

import java.io.IOException;

public class TestServiceNSW extends TestBase{

    HomePage homePage = new HomePage();

    public TestServiceNSW(){
        super();
    }

    @Test
    public void testSearch() throws IOException, InterruptedException {
        homePage
                .search()
                .ValidateSearch();
    }


    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

