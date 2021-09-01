package com.choucair.ui.purchase.preview;

import net.serenitybdd.screenplay.targets.Target;

public class MoneyTransferPreviewHeader {

    public static final Target HEADER_DETAIL = Target
            .the("Detail {0}")
            .locatedBy("//div[@class='CustomerDetails3']//td[contains(., '{0}')]/following-sibling::td[1]");

}
