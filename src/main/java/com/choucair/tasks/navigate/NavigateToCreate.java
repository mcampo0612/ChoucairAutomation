package com.choucair.tasks.navigate;

import com.choucair.models.actor.ChoucairActor;
import com.choucair.tasks.SelectFromCreateThe;
import com.choucair.tasks.login.LoginWith;
import com.choucair.ui.components.UserMenu;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.enums.CreateMenuOptions.WOMEN;
import static com.choucair.tasks.navigate.NavigateTo.loginPage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavigateToCreate {

    public static Performable purchase(ChoucairActor choucairActor) {
        return Task.where("{0} navigates to purchase",
                loginPage(),
                LoginWith
                        .username(choucairActor.getCredentials().getUsername())
                        .andPassword(choucairActor.getCredentials().getPassword()),
                WaitUntil.the(UserMenu.MENU, isVisible()),
                SelectFromCreateThe.option(WOMEN)
        );

    }

    public static Performable registerClient() {
        return Task.where("{0} navigates to registerClient",
                loginPage(),
                WaitUntil.the(UserMenu.SING_IN, isVisible()),
                Click.on(UserMenu.SING_IN)
        );
    }
}
