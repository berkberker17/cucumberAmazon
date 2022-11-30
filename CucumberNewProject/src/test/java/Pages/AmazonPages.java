package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By search = By.id("twotabsearchtextbox");
    static By searchButton = By.id("nav-search-submit-button");
    static By amazonFilter = By.cssSelector("div#deliveryRefinements > ul:nth-of-type(1) > .a-spacing-micro .a-color-base.a-size-base");
    static By appleFilter = By.cssSelector("#brandsRefinements .a-spacing-medium > .a-spacing-micro:nth-of-type(1) .a-color-base");
    static By firstProduct = By.cssSelector("[srcset='https\\:\\/\\/m\\.media-amazon\\.com\\/images\\/I\\/51XanmiXw0L\\._AC_UL320_\\.jpg 1x\\, https\\:\\/\\/m\\.media-amazon\\.com\\/images\\/I\\/51XanmiXw0L\\._AC_UL480_QL65_\\.jpg 1\\.5x\\, https\\:\\/\\/m\\.media-amazon\\.com\\/images\\/I\\/51XanmiXw0L\\._AC_UL640_QL65_\\.jpg 2x\\, https\\:\\/\\/m\\.media-amazon\\.com\\/images\\/I\\/51XanmiXw0L\\._AC_UL800_QL65_\\.jpg 2\\.5x\\, https\\:\\/\\/m\\.media-amazon\\.com\\/images\\/I\\/51XanmiXw0L\\._AC_UL960_QL65_\\.jpg 3x']");
    static By add = By.id("add-to-cart-button");
    static By back = By.id("attach-close_sideSheet-link");
    static By cart = By.id("nav-cart-count");
    static By check = By.cssSelector("[data-a-word-break] [aria-hidden]");

    public  AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() {
    }

    public static void acceptCookie() {
        elementHelper.click(accept);

    }

    public static void clickSearch() {
        elementHelper.click(search);
    }

    public static void writeProduct() {
        elementHelper.sendKey(search,"airpods");
    }

    public static void searchButton() {
        elementHelper.click(searchButton);
    }

    public static void filterAmazon() {
        elementHelper.click(amazonFilter);
    }

    public static void filterApple() {
        elementHelper.click(appleFilter);
    }

    public static void firstProduct() {
        elementHelper.click(firstProduct);
    }

    public static void addCart() {
        elementHelper.click(add);
        elementHelper.click(back);
        elementHelper.click(cart);
    }

    public static void checkCart() {
        elementHelper.checkVisible(check);

    }
}
