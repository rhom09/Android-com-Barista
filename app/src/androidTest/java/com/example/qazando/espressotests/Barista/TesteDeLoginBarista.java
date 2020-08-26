package com.example.qazando.espressotests.Barista;

import android.support.test.rule.ActivityTestRule;

import com.example.qazando.espressotests.R;
import com.example.qazando.espressotests.ui.activity.LoginActivity;

import org.junit.Rule;
import org.junit.Test;

import static com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertDisplayed;
import static com.schibsted.spain.barista.interaction.BaristaClickInteractions.clickBack;
import static com.schibsted.spain.barista.interaction.BaristaClickInteractions.clickOn;
import static com.schibsted.spain.barista.interaction.BaristaEditTextInteractions.writeTo;
import static com.schibsted.spain.barista.interaction.BaristaKeyboardInteractions.closeKeyboard;

public class TesteDeLoginBarista {

    //O Rule no expresso serve para iniciar algo antes de tudo no caso o LoginActivity
    @Rule
    public ActivityTestRule<LoginActivity>
            mActivityRule = new ActivityTestRule<>(LoginActivity.class, false, true);

    @Test
    public void Teste1(){

        writeTo(R.id.login_username, "rhom0909@qazando.com");
        closeKeyboard();
        writeTo(R.id.login_password, "abc123");
        clickOn(R.id.login_button);

        assertDisplayed("Lista de Usuários");
    }

    @Test
    public void Teste2(){

        assertDisplayed(R.id.login_button, "Continuar");
        assertDisplayed(R.id.login_image);
    }

    @Test
    public void Teste3(){

        clickOn(R.id.btn_sign_up_login);
        clickBack();
        assertDisplayed(R.id.btn_sign_up_login);
        assertDisplayed(R.id.login_image);
    }

}
