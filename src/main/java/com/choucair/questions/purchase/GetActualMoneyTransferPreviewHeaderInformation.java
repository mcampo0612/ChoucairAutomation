package com.choucair.questions.purchase;

import com.choucair.models.purchase.Purchase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import org.jetbrains.annotations.NotNull;

import static com.choucair.ui.purchase.preview.MoneyTransferPreviewHeader.HEADER_DETAIL;

public class GetActualMoneyTransferPreviewHeaderInformation implements Question<Purchase> {


    @Override
    public Purchase answeredBy(Actor actor) {
        return getMoneyTransferInformation(actor);
    }

    public static Question<Purchase> fromMoneyTransfer() {
        return new GetActualMoneyTransferPreviewHeaderInformation();
    }

        @NotNull
        private Purchase getMoneyTransferInformation (Actor actor){

            Purchase actualMoneyTransferInformation = new Purchase();

            actualMoneyTransferInformation.setClient(
                    TheTarget.textOf(HEADER_DETAIL.of("Tercero"))
                            .answeredBy(actor));

            actualMoneyTransferInformation.setNit(
                    TheTarget.textOf(HEADER_DETAIL.of("Nit"))
                            .answeredBy(actor));

            return actualMoneyTransferInformation;
        }

    }
