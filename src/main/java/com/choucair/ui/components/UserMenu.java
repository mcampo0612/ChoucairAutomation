package com.choucair.ui.components;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserMenu {

    public static Target MENU =
            Target.the("menu")
                    .located(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']"));

    public static Target EMAIL_CREATE =
            Target.the("email create")
                    .located(By.xpath("email_create"));


    public static Target SING_IN =
            Target.the("sing in")
                    .located(By.xpath("//a[@class='login']"));

}
