package com.choucair.features.purchase;

import com.choucair.conf.BaseConf;
import com.choucair.data.factories.PurchaseFactory;
import com.choucair.models.actor.ChoucairActor;
import com.choucair.models.purchase.Purchase;
import com.choucair.tasks.purchase.AddMoneyTransfer;
import com.choucair.tasks.purchase.preview.SeeThatTheMoneyTransfer;
import com.choucair.tasks.navigate.NavigateToCreate;
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

@WithTagValuesOf({"qa/purchase"})
public class purchase extends BaseConf {

    ChoucairActor miguel;

    @Before
    public void navigate() throws FileNotFoundException {
        miguel = getActorById(MIGUEL.id());
        choucairActor.attemptsTo(
                NavigateToCreate.purchase(miguel)
        );
    }

    @Test
    public void should_MoneyTransferBeCreated_When_SubmitTheCompleteRegistrationData() throws FileNotFoundException {

        Purchase purchase = PurchaseFactory.getPurchaseByKey("purchase-data-complete");

        choucairActor.attemptsTo(
                AddMoneyTransfer.with().client(purchase.getClient())
                        .andDate(purchase.getDate())
                        .andLeaves(purchase.getLeaves())
                        .andEntrance(purchase.getEntrance())
                        .andValue(purchase.getValue())
                        .andObservations(purchase.getObservations()),
                SeeThatTheMoneyTransfer.containsTheExpectedInformation(purchase)
        );

    }

}
