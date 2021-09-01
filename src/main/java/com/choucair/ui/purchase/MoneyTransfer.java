package com.choucair.ui.purchase;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MoneyTransfer {

    public static final Target TITLE_MONEY_TRANSFER = Target.the("label from title money transfer")
            .locatedBy("//td[@class='text-title foreColor']//span[contains(text(),'Nuevo traslado de dinero')]");

    public static final Target CLIENT = Target.the("input from client money transfer")
            .located(By.id("Default_ucControlPane0_ctl00_oTransferHeader_oACAccount_txtAutoCompleteLookup"));

    public static final Target ITEM_CLIENT = Target.the("list from item client money transfer")
            .locatedBy("//td[contains(text(),'{0}')]");

    public static final Target CLEAR_DATE = Target.the("clear date money transfer")
            .located(By.id("Default_ucControlPane0_ctl00_oTransferHeader_imgDateClear"));

    public static final Target DATE = Target.the("input from date money transfer")
            .located(By.id("Default_ucControlPane0_ctl00_oTransferHeader_txtDate"));

    public static final Target LEAVES = Target.the("input from Leaves money transfer")
            .located(By.id("Default_ucControlPane0_ctl00_oTransferGrid_lkpAcAccountFrom_txtAutoCompleteLookup"));

    public static final Target ITEM_LEAVES = Target.the("list from item Leaves money transfer")
            .locatedBy("//td[contains(text(),'{0}')]");

    public static final Target ENTRANCE = Target.the("input from entrance money transfer")
            .located(By.id("Default_ucControlPane0_ctl00_oTransferGrid_lkpAcAccountTo_txtAutoCompleteLookup"));

    public static final Target ITEM_ENTRANCE = Target.the("list from item entrance money transfer")
            .locatedBy("//td[contains(text(),'{0}')]");

    public static final Target VALUE = Target.the("input from value money transfer")
            .located(By.id("txtValue"));

    public static final Target OBSERVATIONS = Target.the("input from Observations money transfer")
            .located(By.id("Default_ucControlPane0_ctl00_txtObservations"));

    public static final Target SAVE = Target.the("Button from save money transfer")
            .located(By.xpath("(//input[@class='buttonClass bgDarkColor'])[2]"));

}
