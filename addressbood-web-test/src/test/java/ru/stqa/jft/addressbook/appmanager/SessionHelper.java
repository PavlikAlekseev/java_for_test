package ru.stqa.jft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver driver) {
        super(driver);
    }
    //метод login
    public void login(String username, String password) {
        type(By.name("user"),username);
        click(By.name("pass"));
        type(By.name("pass"),password);
        click(By.cssSelector("input:nth-child(7)"));
    }
}
