package com.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ManageCart {

    public static Task addProduct() {
        return instrumented(AddProduct.class);
    }

    public static Task proceedToCheckout() {
        return instrumented(ProceedToCheckout.class);
    }

    public static Task removeProduct() {
        return instrumented(RemoveProduct.class);
    }

    public static class AddProduct implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(Target.the("botón de añadir producto").locatedBy("#addProduct"))
            );
        }
    }

    public static class ProceedToCheckout implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(Target.the("botón de proceder al pago").locatedBy("#checkout"))
            );
        }
    }

    public static class RemoveProduct implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(Target.the("botón de eliminar producto").locatedBy("#removeProduct"))
            );
        }
    }
}
