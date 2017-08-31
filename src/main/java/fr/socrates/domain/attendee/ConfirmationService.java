package fr.socrates.domain.attendee;

import fr.socrates.domain.candidate.Candidate;
import fr.socrates.domain.common.AccommodationChoice;
import fr.socrates.domain.meal.Diet;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public interface ConfirmationService {
    List<Candidate> getListAttendee();

    boolean confirm(String candidateEmail, LocalDate date, Payment transfer, AccommodationChoice singleRoom);
    List<Confirmation> getListConfirmations();

    void addDiet(String candidateEmail, Diet diet);
}
