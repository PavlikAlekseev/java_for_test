package ru.stqa.jft.addressbook.appmanager;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {
    public WebDriver driver;

    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;
    private SessionHelper sessionHelper;

    public Map<String, Object> vars;
    JavascriptExecutor js;
    private final Browser browser;

    public ApplicationManager(Browser browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser == Browser.CHROME) {
            driver = new ChromeDriver();
        } else if (browser == Browser.FIREFOX) {
            driver = new FirefoxDriver();
        } else if (browser == Browser.EDGE) {
            driver = new EdgeDriver();
        }
        driver.get("http://localhost/addressbook/");
        driver.manage().window().setSize(new Dimension(1294, 816));
        js = (JavascriptExecutor) groupHelper;
        vars = new HashMap<>();
        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        contactHelper = new ContactHelper(driver);
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
