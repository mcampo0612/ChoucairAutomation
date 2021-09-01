package com.choucair.tasks.purchase.preview;

import com.choucair.models.purchase.Purchase;
import com.choucair.questions.purchase.GetActualMoneyTransferHeaderFrom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SeeThatTheMoneyTransfer implements Task {

    private final Purchase expectedMoneyTransfer;


    public SeeThatTheMoneyTransfer(Purchase expectedMoneyTransfer) {
        this.expectedMoneyTransfer = expectedMoneyTransfer;
    }

    public static SeeThatTheMoneyTransfer containsTheExpectedInformation(Purchase expectedMoneyTransfer) {
        return instrumented(SeeThatTheMoneyTransfer.class, expectedMoneyTransfer);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Purchase actualMoneyTransferInformation = getActualMoneyTransferInformation(actor);

        actor.attemptsTo(
                SeeThatTheHeaderMoneyTransfer
                        .areExpected(actualMoneyTransferInformation, expectedMoneyTransfer),

               SeeThatTheMoneyTransferBodyContent.has()
                       .leaves(expectedMoneyTransfer.getLeaves())
                       .entrance(expectedMoneyTransfer.getEntrance())
                       .value(expectedMoneyTransfer.getValue())
                       .observations(expectedMoneyTransfer.getObservations())
        );


        actor.attemptsTo(
                Switch.toDefaultContext()
        );
    }

    private Purchase getActualMoneyTransferInformation(Actor actor) {
        GetActualMoneyTransferHeaderFrom
                .preview()
                .answeredBy(actor);

        return GetActualMoneyTransferHeaderFrom.preview().answeredBy(actor);
    }
}
