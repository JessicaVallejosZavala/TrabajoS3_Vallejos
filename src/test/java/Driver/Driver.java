package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {
    static private ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();

    public static ChromeDriver abrirURL() throws Exception {
        String rutaProyecto =System.getProperty("user.dir");
        String rutaDriver = rutaProyecto + "/src/main/resources/Driver/chromedriver";

        System.setProperty("webdriver.chrome.driver",rutaDriver);

        //System.setProperty("webdriver.chrome.driver","/src/main/resources/Driver/chromedriver");
        driver.set(new ChromeDriver());
        driver.get().manage().window().maximize();
        driver.get().get("https://portalprivadoqa.transbank.cl/web/portal-3.0/login");
        return (ChromeDriver) driver.get();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
}
