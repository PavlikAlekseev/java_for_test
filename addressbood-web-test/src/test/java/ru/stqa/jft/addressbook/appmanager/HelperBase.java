package ru.stqa.jft.addressbook.appmanager;

import org.openqa.selenium.*;

public class HelperBase {
    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    //вспомогательный метод заполнения объектов класса fillGroupForm
    protected void type(By locator, String text) {
        //если в переменную приходит null, то остается текст по умолчанию
        if (text != null) {
            // проверяем что в поле, если тоже самое, то не трогаем
            String existingText = driver.findElement(locator).getAttribute("value");
            if (!text.equals(existingText)) {
                click(locator);
                driver.findElement(locator).sendKeys(text);
            }
        }
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

    //перехват исключений
    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        }// если поймали, то перехватить
        catch (NoAlertPresentException e) {
            return false;
        }
    }

    //метод наличия элемента
    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }

    }
}
