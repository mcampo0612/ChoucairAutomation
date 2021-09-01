package com.choucair.tasks.purchase.preview;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.StringContains;

import static com.choucair.ui.purchase.preview.MoneyTransferPreviewBody.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ValidateThePreviewMoneyTransferBodyContent {

    private ValidateThePreviewMoneyTransferBodyContent() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable leaves(String leaves) {
        return Task.where("{0} see that the leaves is " + leaves,
                actor ->
                        theActorInTheSpotlight().should(
                                seeThat("leaves", Text.of(LEAVES).asAString(),
                                        StringContains.containsString(leaves))));
    }

    public static Performable entrance(String entrance) {
        return Task.where("{0} see that the entrance is " + entrance,
                actor ->
                        theActorInTheSpotlight().should(
                                seeThat("entrance", Text.of(ENTRANCE).asAString(),
                                        StringContains.containsString(entrance))));
    }

    public static Performable value(String value) {

        String formatValue = value.replace(",", ".").replaceFirst("[.]", ",");
        return Task.where("{0} see that the value is " + formatValue,
                actor -> theActorInTheSpotlight().should(
                                seeThat("value", Text.of(VALUE).asAString(),
                                        IsEqual.equalTo(formatValue))));
    }

    public static Performable observations(String observations) {
        return Task.where("{0} see that the observations is " + observations,
                actor ->
                        theActorInTheSpotlight().should(
                                seeThat("observations", Text.of(OBSERVATIONS.of(observations)).asAString(),
                                        IsEqual.equalTo(observations))));
    }

}