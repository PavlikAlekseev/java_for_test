package ru.stqa.jft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends  HelperBase{

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    //переход на страницу Группы
    public void goToGroupPage() {
        click(By.linkText("groups"));
    }

    //переход на страницу Нового контакта
    public void goToAddNewPage() {
        click(By.linkText("add new"));
    }

}
