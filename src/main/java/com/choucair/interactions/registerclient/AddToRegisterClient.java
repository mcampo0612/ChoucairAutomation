package com.choucair.interactions.registerclient;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.ui.registerclient.RegisterClient.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddToRegisterClient {

    public static Performable email(String email) {
        return Task.where("{0} add a client #client",
                Click.on(EMAIL_ACCOUNT)
                        .then(Enter.theValue(email).into(EMAIL_ACCOUNT))
        ).with("client").of(email);
    }

    public static Performable createAccount() {
        return Task.where("{0} add a client #client",
                Click.on(CREATE_ACCOUNT)
        );
    }

    public static Performable firstName(String firstName) {
        return Task.where("{0} add a first name #firstName",
                Click.on(FIRST_NAME).then(Enter.theValue(firstName).into(FIRST_NAME))
        ).with("firstName").of(firstName);
    }

    public static Performable lastName(String lastName) {
        return Task.where("{0} add a last name #lastName",
                Click.on(LAST_NAME).then(Enter.theValue(lastName).into(LAST_NAME))
        ).with("firstName").of(lastName);
    }

    public static Performable password(String password) {
        return Task.where("{0} add a password #password",
                Click.on(PASSWORD).then(Enter.theValue(password).into(PASSWORD))
        ).with("password").of(password);
    }

    public static Performable birthDay(String birthDay) {
        return Task.where("{0} add a birthDay #birthDay",
                Click.on(SELECT_DAY)
                        .then(Enter.theValue(birthDay).into(SELECT_DAY))
                        .then(WaitUntil.the(BIRTH_DAY.of(birthDay), isVisible()))
                        .then(Click.on(BIRTH_DAY.of(birthDay)))
        ).with("birthDay").of(birthDay);
    }

    public static Performable birthMouth(String birthMouth) {
        return Task.where("{0} add a birthMouth #birthMouth",
                Click.on(SELECT_MONTHS)
                        .then(Enter.theValue(birthMouth).into(SELECT_MONTHS))
                        .then(WaitUntil.the(BIRTH_MONTHS.of(birthMouth), isVisible()))
                        .then(Click.on(BIRTH_MONTHS.of(birthMouth)))
        ).with("birthMouth").of(birthMouth);
    }

    public static Performable birthYears(String birthYears) {
        return Task.where("{0} add a birthYears #birthYears",
                Click.on(SELECT_YEARS)
                        .then(Enter.theValue(birthYears).into(SELECT_YEARS))
                        .then(WaitUntil.the(BIRTH_YEARS.of(birthYears), isVisible()))
                        .then(Click.on(BIRTH_YEARS.of(birthYears)))
        ).with("birthYears").of(birthYears);
    }

    public static Performable firstNameAddress(String firstNameAddress) {
        return Task.where("{0} add a firstNameAddress #firstNameAddress",
                Click.on(FIRST_NAME_ADDRESS).then(Enter.theValue(firstNameAddress).into(FIRST_NAME_ADDRESS))
        ).with("firstNameAddress").of(firstNameAddress);
    }

    public static Performable lastNameAddress(String lastNameAddress) {
        return Task.where("{0} add a lastNameAddress #lastNameAddress",
                Click.on(LAST_NAME_ADDRESS).then(Enter.theValue(lastNameAddress).into(LAST_NAME_ADDRESS))
        ).with("lastNameAddress").of(lastNameAddress);
    }

    public static Performable company(String company) {
        return Task.where("{0} add a company #company",
                Click.on(COMPANY).then(Enter.theValue(company).into(COMPANY))
        ).with("company").of(company);
    }

    public static Performable address(String address) {
        return Task.where("{0} add a address #address",
                Click.on(ADDRESS).then(Enter.theValue(address).into(ADDRESS))
        ).with("address").of(address);
    }

    public static Performable city(String city) {
        return Task.where("{0} add a city #city",
                Click.on(CITY).then(Enter.theValue(city).into(CITY))
        ).with("address").of(city);
    }

    public static Performable state(String state) {
        return Task.where("{0} add a state #state",
                Click.on(STATE).then(Enter.theValue(state).into(STATE))
        ).with("state").of(state);
    }


    public static Performable codePostal(String codePostal) {
        return Task.where("{0} add a codePostal #codePostal",
                Click.on(CODE_POSTAL).then(Enter.theValue(codePostal).into(CODE_POSTAL))
        ).with("codePostal").of(codePostal);
    }

    public static Performable country(String country) {
        return Task.where("{0} add a country #country",
                Click.on(COUNTRY).then(Enter.theValue(country).into(COUNTRY))
        ).with("country").of(country);
    }

    public static Performable mobile(String mobile) {
        return Task.where("{0} add a mobile #mobile",
                Click.on(MOBILE).then(Enter.theValue(mobile).into(MOBILE))
        ).with("mobile").of(mobile);
    }

    public static Performable register() {
        return Task.where("{0} btn a register",
                Click.on(REGISTER));
    }

}
