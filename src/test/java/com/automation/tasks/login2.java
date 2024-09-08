package com.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final String usuario;
    private final String contraseña;

    public Login(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public static Login conCredenciales(String usuario, String contraseña) {
        return instrumented(Login.class, usuario, contraseña);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(Target.the("campo de usuario").locatedBy("#usuario")),
                Enter.theValue(contraseña).into(Target.the("campo de contraseña").locatedBy("#contraseña")),
                Click.on(Target.the("botón de inicio de sesión").locatedBy("#iniciarSesion"))
        );
    }
}
