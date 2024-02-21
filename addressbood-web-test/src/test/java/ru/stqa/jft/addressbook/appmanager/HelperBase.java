package ru.stqa.jft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    //вспомогательный метод заполнения объектов класса fillGroupForm
    protected void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).sendKeys(text);
    }

    //вспомогательный метод кликания с параметром locator
    protected void click(By locator) {
        driver.findElement(locator).click();
    }
}
