package ru.stqa.jft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.jft.addressbook.model.GroupData;

public class GroupHelper {
    private WebDriver driver;

    public GroupHelper(WebDriver driver) {
        this.driver = driver;
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

    //удаление выбранной группы
    public void deleteSelectedGroups() {
      driver.findElement(By.name("delete")).click();
    }

    //выбор группы
    public void selectGroup() {
      driver.findElement(By.name("selected[]")).click();
    }
}
