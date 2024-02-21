package ru.stqa.jft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase{
    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    //метод принимает объект ContactData
    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"),contactData.firstname());
        type(By.name("middlename"), contactData.middlename());
        type(By.name("lastname"), contactData.lastname());
        type(By.name("nickname"), contactData.nickname());
        type(By.name("company"), contactData.company());
        type(By.name("address"), contactData.address());
        type(By.name("home"), contactData.homephone());
        type(By.name("email"), contactData.email());
        birthdayDropdown(By.name("bday"),"30");
        birthdayDropdown(By.name("bmonth"),"July");
        type(By.name("byear"), contactData.byear());
    }


    //подтверждение создания контакта
    public void submitContactCreate() {
        click(By.cssSelector("input:nth-child(87)"));
    }
}