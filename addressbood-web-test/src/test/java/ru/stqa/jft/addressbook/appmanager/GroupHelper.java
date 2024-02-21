package ru.stqa.jft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.jft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    //метод принимает объект GroupData
    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.name());
        type(By.name("group_header"), groupData.header());
        type(By.name("group_footer"), groupData.footer());
    }

    //возвращение на страницу Группы
    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    //подтверждение создания группы
    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    //инициализации создания группы
    public void initGroupCreation() {
        click(By.name("new"));
    }

    //удаление выбранной группы
    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    //выбор группы
    public void selectGroup() {
        click(By.name("selected[]"));
    }

    //редактирование группы
    public void initGroupModification() {
        click(By.name("edit"));
    }

    //подтверждение редактирования группы
    public void submitGroupModification() {
        click(By.name("update"));
    }
}
