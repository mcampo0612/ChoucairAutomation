package com.choucair.tasks.purchase.preview;

import com.choucair.models.purchase.Purchase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.choucair.ui.purchase.preview.MoneyTransferPreview.LBL_MONEY_TRANSFER_TITLE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.Matchers.equalTo;


public class SeeThatTheHeaderMoneyTransfer implements Task {

    private final Purchase actualMoneyTransfer;
    private final Purchase expectedMoneyTransfer;

    public SeeThatTheHeaderMoneyTransfer(Purchase actualMoneyTransfer, Purchase expectedMoneyTransfer) {
        this.expectedMoneyTransfer = expectedMoneyTransfer;
        this.actualMoneyTransfer = actualMoneyTransfer;
    }

    public static SeeThatTheHeaderMoneyTransfer areExpected(Purchase actualMoneyTransfer, Purchase expectedMoneyTransfer) {
        return instrumented(SeeThatTheHeaderMoneyTransfer.class, actualMoneyTransfer, expectedMoneyTransfer);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.should(
                seeThat(the(LBL_MONEY_TRANSFER_TITLE), isPresent()),

                seeThat("client", a -> actualMoneyTransfer.getClient(),
                        equalTo(expectedMoneyTransfer.getClient())
                ),

                seeThat("nit", a -> actualMoneyTransfer.getNit(),
                        equalTo(expectedMoneyTransfer.getNit())

                )
        );
    }
}