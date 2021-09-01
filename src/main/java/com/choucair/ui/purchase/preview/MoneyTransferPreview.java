package com.choucair.ui.purchase.preview;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MoneyTransferPreview {

    public static final Target LBL_MONEY_TRANSFER_TITLE = Target.the("label from money transfer title")
            .located(By.id("Default_ucControlPane0_ContainerTitle"));
}
