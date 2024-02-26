package ru.stqa.jft.addressbook.appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.jft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    //метод принимает объект ContactData
    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.firstname());
        type(By.name("middlename"), contactData.middlename());
        type(By.name("lastname"), contactData.lastname());
        type(By.name("nickname"), contactData.nickname());
        type(By.name("company"), contactData.company());
        type(By.name("address"), contactData.address());
        type(By.name("home"), contactData.homephone());
        type(By.name("email"), contactData.email());
        birthdayDropdown(By.name("bday"), "30");
        birthdayDropdown(By.name("bmonth"), "July");
        type(By.name("byear"), contactData.byear());

        //выбора группы есть только на форме создания контакта (на модификации нету), либо выбираем из списка, либо проверяем отсутствие списка
        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.group());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }


    //подтверждение создания контакта
    public void submitContactCreate() {
        click(By.cssSelector("input:nth-child(87)"));
    }

    //редактирование контакта
    public void initContactModification() {
        click(By.cssSelector(".odd:nth-child(3) > .center:nth-child(8) img"));
    }

    //подтверждение редактирования контакта
    public void submitContactModification() {
        click(By.name("update"));
    }

    //выбор контакта
    public void selectContact() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[3]/td/input"));
    }

    //удаление контакта
    public void deleteContact() {
        click(By.cssSelector(".left:nth-child(8) > input"));
    }


    //подтверждение в диалоговом окне удаления контакта
    public void acceptDeleteContact() {
        driver.switchTo().alert().accept();
    }
}
