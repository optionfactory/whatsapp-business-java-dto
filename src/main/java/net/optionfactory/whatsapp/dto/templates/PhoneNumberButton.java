package net.optionfactory.whatsapp.dto.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.optionfactory.whatsapp.dto.templates.type.ButtonType;

/**
 * The type Phone number button.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PhoneNumberButton extends Button {
    @JsonProperty("phone_number")
    private String phoneNumber;

    /**
     * Instantiates a new Phone number button.
     *
     * @param text the text
     */
    public PhoneNumberButton(String text, String phoneNumber) {
        super(ButtonType.PHONE_NUMBER, text);
        this.phoneNumber = phoneNumber;

    }

    /**
     * Instantiates a new Phone number button.
     */
    public PhoneNumberButton() {
        super(ButtonType.PHONE_NUMBER);
    }

    /**
     * Gets phone number.
     *
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phone number.
     *
     * @param phoneNumber the phone number
     * @return the phone number
     */
    public PhoneNumberButton setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
