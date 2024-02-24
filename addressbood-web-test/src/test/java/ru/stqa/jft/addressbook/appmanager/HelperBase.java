package ru.stqa.jft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    //метод выбора месяца и дня рождения на карточке создания контакта
    protected void birthdayDropdown(By locator, String text) {
        click(locator);
        WebElement dropdown = driver.findElement(locator);
        dropdown.findElement(By.xpath("//option[. = '" + (text) + "']")).click();
    }
}
