package ru.stqa.jft.addressbook.tests;// Generated by Selenium IDE

import org.junit.Test;
import ru.stqa.jft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testCreateContact() {
        app.getNavigationHelper().goToHomePage();
        app.getNavigationHelper().goToAddNewPage();
        app.getContactHelper().fillContactForm(new ContactData("Pavel", "Alekseev", "Pavlikovich", "Prrr", "BSPB", "Saint-Petersburg", "4637465", "alexeew.ps@mail.ru", "30", "July", "1992", "Test2"), true);
        app.getContactHelper().submitContactCreate();
    }


}
