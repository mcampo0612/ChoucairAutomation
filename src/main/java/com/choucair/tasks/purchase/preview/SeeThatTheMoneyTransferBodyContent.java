package com.choucair.tasks.purchase.preview;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.ArrayList;
import java.util.List;

public class SeeThatTheMoneyTransferBodyContent implements Task {

    private final List<Performable> moneyTransferContentTasks = new ArrayList<>();

    public static SeeThatTheMoneyTransferBodyContent has() {
        return new SeeThatTheMoneyTransferBodyContent();
    }

    public SeeThatTheMoneyTransferBodyContent leaves(String expectedLeaves) {
        moneyTransferContentTasks.add(ValidateThePreviewMoneyTransferBodyContent.leaves(expectedLeaves));
        return this;
    }

    public SeeThatTheMoneyTransferBodyContent entrance(String expectedEntrance) {
        moneyTransferContentTasks.add(ValidateThePreviewMoneyTransferBodyContent.entrance(expectedEntrance));
        return this;
    }

    public SeeThatTheMoneyTransferBodyContent value(String expectedValue) {
        moneyTransferContentTasks.add(ValidateThePreviewMoneyTransferBodyContent.value(expectedValue));
        return this;
    }


    public SeeThatTheMoneyTransferBodyContent observations(String expectedObservations) {
        moneyTransferContentTasks.add(ValidateThePreviewMoneyTransferBodyContent.observations(expectedObservations));
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                validationsForThePreviewBodyContent()
        );
    }

    private Performable[] validationsForThePreviewBodyContent() {
        return this.moneyTransferContentTasks.toArray(new Performable[moneyTransferContentTasks.size()]);
    }
}
