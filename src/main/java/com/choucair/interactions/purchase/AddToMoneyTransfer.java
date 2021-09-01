package com.choucair.interactions.purchase;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.ui.purchase.MoneyTransfer.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class AddToMoneyTransfer {

    public static Performable client(String client) {
        return Task.where("{0} add a client #client",
                        Click.on(CLIENT)
                                .then(Enter.theValue(client).into(CLIENT))
                                .then(WaitUntil.the(ITEM_CLIENT.of(client), isVisible()))
                                .then(Click.on(ITEM_CLIENT.of(client)))
                        ).with("client").of(client);
    }

    public static Performable date(String date) {
        return Task.where("{0} add a date #date",
                Click.on(CLEAR_DATE).then(Click.on(DATE))
                        .then(Enter.theValue(date).into(DATE))).with("date").of(date);

    }

    public static Performable leaves(String leaves) {
        return Task.where("{0} add a leaves #leaves",
                        Click.on(LEAVES)
                                .then(Enter.theValue(leaves).into(LEAVES))
                                .then(WaitUntil.the(ITEM_LEAVES.of(leaves), isVisible()))
                                .then(Click.on(ITEM_LEAVES.of(leaves)))
                ).with("leaves").of(leaves);
    }

    public static Performable entrance(String entrance) {
        return Task.where("{0} add a entrance #entrance",
                        Click.on(ENTRANCE)
                                .then(Enter.theValue(entrance).into(ENTRANCE))
                                .then(WaitUntil.the(ITEM_ENTRANCE.of(entrance), isVisible()))
                                .then(Click.on(ITEM_ENTRANCE.of(entrance)))
                        ).with("entrance").of(entrance);
    }

    public static Performable value(String value) {
        return Task.where("{0} add a value #value",
                Click.on(VALUE)
                        .then(Enter.theValue(value).into(VALUE))).with("value").of(value);
    }

    public static Performable observations(String observations) {
        return Task.where("{0} add a observations #observations",
                        Click.on(OBSERVATIONS)
                                .then(Enter.theValue(observations).into(OBSERVATIONS)))
                .with("observations").of(observations);
    }

    public static Performable saveMoneyTransfer() {
        return Task.where("{0} add a save #save",
                Click.on(SAVE));
    }


}
