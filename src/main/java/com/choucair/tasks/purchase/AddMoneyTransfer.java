package com.choucair.tasks.purchase;

import com.choucair.interactions.purchase.AddToMoneyTransfer;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.ArrayList;
import java.util.List;

public class AddMoneyTransfer implements Task {

    List<Performable> itemsMoneyTransfer;

    public AddMoneyTransfer() {
        itemsMoneyTransfer = new ArrayList<>();
    }

    public static AddMoneyTransfer with() {
        return new AddMoneyTransfer();
    }

    public AddMoneyTransfer client(String client) {
        this.itemsMoneyTransfer.add(AddToMoneyTransfer.client(client));
        return this;
    }

    public AddMoneyTransfer andDate(String date) {
        this.itemsMoneyTransfer.add(AddToMoneyTransfer.date(date));
        return this;
    }

    public AddMoneyTransfer andLeaves(String leaves) {
        this.itemsMoneyTransfer.add(AddToMoneyTransfer.leaves(leaves));
        return this;
    }

    public AddMoneyTransfer andEntrance(String entrance) {
        this.itemsMoneyTransfer.add(AddToMoneyTransfer.entrance(entrance));
        return this;
    }

    public AddMoneyTransfer andValue(String value) {
        this.itemsMoneyTransfer.add(AddToMoneyTransfer.value(value));
        return this;
    }

    public AddMoneyTransfer andObservations(String observations) {
        this.itemsMoneyTransfer.add(AddToMoneyTransfer.observations(observations));
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                moneyTransferActions()
        );
    }

    private Performable[] moneyTransferActions() {
        this.itemsMoneyTransfer.add(AddToMoneyTransfer.saveMoneyTransfer());
        return this.itemsMoneyTransfer.toArray(new Performable[this.itemsMoneyTransfer.size()]);
    }

}
