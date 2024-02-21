package ru.stqa.jft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.jft.addressbook.model.GroupData;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {
    public WebDriver driver;
    public Map<String, Object> vars;
    JavascriptExecutor js;

    public void init() {
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

    public void stop() {
        driver.quit();
    }

    //возвращение на страницу Группы
    public void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    //подтверждение создания группы
    public void submitGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }

    //метод принимает объект GroupData
    public void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).sendKeys(groupData.name());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).sendKeys(groupData.header());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.footer());
    }

    //инициализации создания группы
    public void initGroupCreation() {
        driver.findElement(By.name("new")).click();
    }

    //переход на страницу Группы
    public void goToGroupPage() {
        driver.findElement(By.linkText("groups")).click();
    }

    //удаление выбранной группы
    public void deleteSelectedGroups() {
      driver.findElement(By.name("delete")).click();
    }

    //выбор группы
    public void selectGroup() {
      driver.findElement(By.name("selected[]")).click();
    }
}
