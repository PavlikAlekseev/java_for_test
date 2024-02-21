package ru.stqa.jft.addressbook;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class TestBase {

    JavascriptExecutor js;
    public WebDriver driver;
    public Map<String, Object> vars;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        login("admin", "secret");
    }

    //метод login
    private void login(String username, String password) {
        driver.get("http://localhost/addressbook/");
        driver.manage().window().setSize(new Dimension(1294, 816));
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    //метод возвращения на страницу Группы
    protected void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    //метод подтверждения создания группы
    protected void submitGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }

    //метод принимает объект GroupData
    protected void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).sendKeys(groupData.name());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).sendKeys(groupData.header());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.footer());
    }

    //метод инициализации создания группы
    protected void initGroupCreation() {
        driver.findElement(By.name("new")).click();
    }

    //метод перехода на страницу Группы
    protected void goToGroupPage() {
        driver.findElement(By.linkText("groups")).click();
    }

    //удалить выбранную группу
    protected void deleteSelectedGroups() {
      driver.findElement(By.name("delete")).click();
    }

    //выбрать группу
    protected void selectGroup() {
      driver.findElement(By.name("selected[]")).click();
    }
}
