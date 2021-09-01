package com.choucair.tasks.registerclient;

import com.choucair.interactions.registerclient.AddToRegisterClient;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.ArrayList;
import java.util.List;

public class AddRegisterClient implements Task {

    List<Performable> itemsRegisterClient;

    public AddRegisterClient() {
        itemsRegisterClient = new ArrayList<>();
    }

    public static AddRegisterClient with() {
        return new AddRegisterClient();
    }

    public AddRegisterClient client(String client) {
        this.itemsRegisterClient.add(AddToRegisterClient.email(client));
        return this;
    }

    public AddRegisterClient andFirstName(String firstName) {
        this.itemsRegisterClient.add(AddToRegisterClient.firstName(firstName));
        return this;
    }

    public AddRegisterClient andLastName(String lastName) {
        this.itemsRegisterClient.add(AddToRegisterClient.lastName(lastName));
        return this;
    }

    public AddRegisterClient andPassword(String password) {
        this.itemsRegisterClient.add(AddToRegisterClient.password(password));
        return this;
    }

    public AddRegisterClient andBirthDay(String day) {
        this.itemsRegisterClient.add(AddToRegisterClient.birthDay(day));
        return this;
    }

    public AddRegisterClient andBirthMouth(String mouth) {
        this.itemsRegisterClient.add(AddToRegisterClient.birthMouth(mouth));
        return this;
    }

    public AddRegisterClient andBirthYears(String years) {
        this.itemsRegisterClient.add(AddToRegisterClient.birthYears(years));
        return this;
    }

    public AddRegisterClient andFirstNameAddress(String firstAddress) {
        this.itemsRegisterClient.add(AddToRegisterClient.firstNameAddress(firstAddress));
        return this;
    }

    public AddRegisterClient andLastNameAddress(String lastAddress) {
        this.itemsRegisterClient.add(AddToRegisterClient.lastNameAddress(lastAddress));
        return this;
    }

    public AddRegisterClient andCompany(String company) {
        this.itemsRegisterClient.add(AddToRegisterClient.company(company));
        return this;
    }

    public AddRegisterClient andAddress(String address) {
        this.itemsRegisterClient.add(AddToRegisterClient.address(address));
        return this;
    }

    public AddRegisterClient andCity(String city) {
        this.itemsRegisterClient.add(AddToRegisterClient.city(city));
        return this;
    }

    public AddRegisterClient andState(String state) {
        this.itemsRegisterClient.add(AddToRegisterClient.state(state));
        return this;
    }

    public AddRegisterClient andCodePostal(String codePostal) {
        this.itemsRegisterClient.add(AddToRegisterClient.codePostal(codePostal));
        return this;
    }

    public AddRegisterClient andCountry(String country) {
        this.itemsRegisterClient.add(AddToRegisterClient.country(country));
        return this;
    }

    public AddRegisterClient andMobile(String mobile) {
        this.itemsRegisterClient.add(AddToRegisterClient.mobile(mobile));
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                registerClientActions()
        );
    }

    private Performable[] registerClientActions() {
        //this.itemsRegisterClient.add(AddToRegisterClient.register());
        return this.itemsRegisterClient.toArray(new Performable[this.itemsRegisterClient.size()]);
    }

}
