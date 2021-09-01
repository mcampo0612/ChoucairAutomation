package com.choucair.questions.purchase;

import com.choucair.models.purchase.Purchase;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GetActualMoneyTransferHeaderFrom {

    public static Question<Purchase> preview() {
        return actor -> {
            Purchase actualMoneyTransfer = GetActualMoneyTransferPreviewHeaderInformation
                    .fromMoneyTransfer()
                    .answeredBy(theActorInTheSpotlight());

            return actualMoneyTransfer;
        };
    }
}
