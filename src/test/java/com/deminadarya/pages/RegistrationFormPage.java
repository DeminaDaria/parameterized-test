package com.deminadarya.pages;

import com.codeborne.selenide.SelenideElement;
import com.deminadarya.domain.TestData;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormPage {

    private final SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderInput = $("#genterWrapper"),
            numberInput = $("#userNumber"),
            subjectInput = $("#subjectsInput"),
            hobbyInput = $("#hobbiesWrapper"),
            addressInput = $("#currentAddress"),
            stateInput = $("#state"),
            cityInput = $("#city"),
            buttonSend = $("button#submit");

    public void openPage() {
        open("/automation-practice-form");
    }

    public void typeFirstName(String value) {
        firstNameInput.setValue(value);
    }

    public void typeLastName(String value) {
        lastNameInput.setValue(value);
    }

    public void typeEmail(String value) {
        emailInput.setValue(value);
    }

    public void genderChose(String value) {
        genderInput.$(byText(value)).click();
    }

    public void typeNumber(String value) {
        numberInput.setValue(value);
    }

    public void typeSubject(String value) {
        subjectInput.setValue(value).pressTab();
    }

    public RegistrationFormPage typeHobby(String value) {
        hobbyInput.$(byText(value)).click();
        return this;
    }

    public void typeAddress(String value) {
        addressInput.setValue(value);
    }

    public void typeStateCity(String state, String city) {
        stateInput.click();
        stateInput.$(byText(state)).click();
        cityInput.click();
        cityInput.$(byText(city)).click();
    }

    public void sendForm() {
        buttonSend.click();
    }
}
