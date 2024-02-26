package ru.stqa.jft.addressbook.model;

public record ContactData(String firstname, String middlename, String lastname, String nickname, String company,
                          String address, String homephone, String email, String bday, String bmonth, String byear,
                          String group) {
}