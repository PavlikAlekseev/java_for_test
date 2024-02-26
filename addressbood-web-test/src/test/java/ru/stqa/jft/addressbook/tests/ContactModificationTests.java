package ru.stqa.jft.addressbook.tests;

import org.junit.Test;
import ru.stqa.jft.addressbook.model.ContactData;


public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Ivan", "Ivanov", "Pavlikovich", "Prrr", "BSPB", "Saint-Petersburg", "4637465", "alexeew.ps@mail.ru", "30", "July", "1992", null), false);
        app.getContactHelper().submitContactModification();
    }
}
