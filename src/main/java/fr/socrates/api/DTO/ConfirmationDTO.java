package fr.socrates.api.DTO;

import fr.socrates.domain.attendee.Payment;
import fr.socrates.domain.common.AccommodationChoice;

import javax.validation.constraints.NotNull;

public class ConfirmationDTO {
    @NotNull
    private String email;
    @NotNull
    private AccommodationChoice accommodationChoice;
    @NotNull
    private Payment payment;


    public ConfirmationDTO() {
    }

    public ConfirmationDTO(String email, AccommodationChoice accommodationChoice, Payment payment) {
        this.email = email;
        this.accommodationChoice = accommodationChoice;
        this.payment = payment;
    }

    public String getEmail() {
        return email;
    }

    public AccommodationChoice getAccommodationChoice() {
        return accommodationChoice;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static ConfirmationDTO mapToDTO(String candidateEmail, AccommodationChoice accommodationChoice, Payment payment) {
        // TODO #Demeter
        return new ConfirmationDTO(candidateEmail, accommodationChoice, payment);
    }
}
