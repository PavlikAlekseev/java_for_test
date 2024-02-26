package ru.stqa.jft.addressbook.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.Browser;
import ru.stqa.jft.addressbook.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(Browser.CHROME);

    @Before
    public void setUp() {
        app.init();
    }

    @After
    public void tearDown() {
        app.stop();
    }

}
