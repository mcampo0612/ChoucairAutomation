package com.choucair.tasks;

import com.choucair.enums.CreateMenuOptions;
import com.choucair.ui.components.header.CreateMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectFromCreateThe implements Interaction {

    private final CreateMenuOptions option;

    public SelectFromCreateThe(CreateMenuOptions option) {
        this.option = option;
    }

    public static Performable option(CreateMenuOptions option) {
        return instrumented(SelectFromCreateThe.class, option);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreateMenu.WOMEN),
                WaitUntil.the(CreateMenu.OPTION.of(option.asString()), isVisible()),
                Click.on(CreateMenu.OPTION.of(option.asString()))
        );
    }
}
