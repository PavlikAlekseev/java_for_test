package ru.stqa.jft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    //переход на страницу Группы с проверкой того что находимся на странице группы
    public void goToGroupPage() {
        if (isAlertPresent(By.tagName("h1"))
                && driver.findElement(By.tagName("h1")).getText().equals("Groupa")
                && isElementPresent(By.name("new"))){
            return;
        }
        click(By.linkText("groups"));
    }

    //переход на страницу Нового контакта
    public void goToAddNewPage() {
        click(By.linkText("add new"));
    }

    //переход на главную страницу
    public void goToHomePage() {
        if (isElementPresent(By.id("maintable"))){
            return;
        }
        click(By.linkText("home"));
    }

}
