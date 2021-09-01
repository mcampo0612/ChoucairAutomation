package com.choucair.features.register;

import com.choucair.conf.BaseConf;
import com.choucair.data.factories.RegisterClientFactory;
import com.choucair.interactions.registerclient.AddToRegisterClient;
import com.choucair.models.actor.ChoucairActor;
import com.choucair.models.registerclient.RegisterClient;
import com.choucair.tasks.navigate.NavigateToCreate;
import com.choucair.tasks.registerclient.AddRegisterClient;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.FileNotFoundException;

import static com.choucair.data.factories.ActorFactory.getActorById;
import static com.choucair.enums.ActorName.MIGUEL;

@RunWith(SerenityRunner.class)

@WithTagValuesOf({"register-client"})
public class RegisterClients extends BaseConf {

    ChoucairActor miguel;

    @Before
    public void navigate() throws FileNotFoundException {
        miguel = getActorById(MIGUEL.id());
        choucairActor.attemptsTo(
                NavigateToCreate.registerClient()
        );
    }

    @Test
    public void should_RegisterClientBeCreated_When_SubmitTheCompleteRegistrationData() throws FileNotFoundException {

        RegisterClient registerClient = RegisterClientFactory.getRegisterClientByKey("register-client-data-complete");

        choucairActor.attemptsTo(
                AddToRegisterClient.email(registerClient.getEmail()),
                AddToRegisterClient.createAccount(),
                AddRegisterClient.with()
                        .client(registerClient.getClient())
                        .andFirstName(registerClient.getFirstName())
                        .andLastName(registerClient.getLastName())
                        .andPassword(registerClient.getPassword())
                        .andFirstNameAddress(registerClient.getFirstNameAddress())
                        .andLastNameAddress(registerClient.getLastNameAddress())
                        .andCompany(registerClient.getCompany())
                        .andAddress(registerClient.getAddress())
                        .andCity(registerClient.getCity())
                        .andCodePostal(registerClient.getCodePostal())
                        .andMobile(registerClient.getMobilePhone())
        );

    }


}
