package com.choucair.ui.registerclient;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterClient {


    public static final Target EMAIL_ACCOUNT = Target.the("input from email address")
            .located(By.id("email_create"));

    public static final Target CREATE_ACCOUNT = Target.the("btn submit create")
            .located(By.id("SubmitCreate"));

    public static final Target TITLE = Target.the("btn title")
            .located(By.id("id_gender1"));

    public static final Target FIRST_NAME = Target.the("input name")
            .located(By.id("customer_firstname"));

    public static final Target LAST_NAME = Target.the(" input last name")
            .located(By.id("customer_lastname"));

    public static final Target PASSWORD = Target.the(" input pass")
            .located(By.id("passwd"));


    public static final Target SELECT_DAY = Target.the(" input day")
            .located(By.xpath("//div[@class='selector']//select[@id='c']"));

    public static final Target BIRTH_DAY = Target.the(" input day")
            .locatedBy("//select[@class='form-control']//option[contains(text(),'{0}')]");

    public static final Target SELECT_MONTHS = Target.the(" input months")
            .located(By.id("months"));

    public static final Target BIRTH_MONTHS = Target.the(" input months")
            .locatedBy("//select[@class='form-control']//option[contains(text(),'{0}')]");

    public static final Target SELECT_YEARS = Target.the(" input years")
            .located(By.id("years"));

    public static final Target BIRTH_YEARS = Target.the(" input years")
            .locatedBy("//select[@class='form-control']//option[contains(text(),'{0}')]");

    public static final Target FIRST_NAME_ADDRESS = Target.the("input firts Name address")
            .located(By.id("firstname"));

    public static final Target LAST_NAME_ADDRESS = Target.the(" input last name address")
            .located(By.id("lastname"));

    public static final Target COMPANY = Target.the(" input company")
            .located(By.id("company"));

    public static final Target ADDRESS = Target.the(" input company")
            .located(By.id("address1"));

    public static final Target CITY = Target.the(" input city")
            .located(By.id("city"));

    public static final Target STATE = Target.the(" input state")
            .located(By.id("id_state"));

    public static final Target CODE_POSTAL = Target.the(" input postcode")
            .located(By.id("postcode"));

    public static final Target COUNTRY = Target.the(" input id_country")
            .located(By.id("id_country"));

    public static final Target MOBILE = Target.the(" input phone_mobile")
            .located(By.id("phone_mobile"));

    public static final Target REGISTER = Target.the(" btn register")
            .located(By.id("submitAccount"));
}
