package AmazonAutomation;
import com.AmazonAutomation.AmazonPage;
import BeforeAfterAnnotation.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {
    @Test
    public void Amazonkindle() throws Exception {
        AmazonPage amazon=new AmazonPage(driver.get());
        amazon.navigateToWebsite().clickonHamburgerMenu().clickKindle().clickOnBuy().isEmailorMobileNumberDisplayed();
    }
}
