package com.choucair.ui.purchase.preview;

import net.serenitybdd.screenplay.targets.Target;


public class MoneyTransferPreviewBody {

    public static final Target LEAVES = Target
            .the("leaves")
            .locatedBy("(//td[@class='InsideItem Alphanumeric'])[1]");

    public static final Target ENTRANCE = Target
            .the("entrance")
            .locatedBy("(//td[@class='InsideItem Alphanumeric'])[2]");

    public static final Target VALUE = Target
            .the("value")
            .locatedBy("(//td[@class='InsideItem Alphanumeric'])[3]");

    public static final Target OBSERVATIONS = Target
            .the("observations")
            .locatedBy("//td[contains(text(),'{0}')]");

}