package fr.socrates.domain.attendee;

import fr.socrates.domain.candidate.Candidate;
import fr.socrates.domain.candidate.exceptions.CandidateException;
import fr.socrates.domain.common.AccommodationChoice;

import java.time.LocalDate;
import java.util.List;

public interface ConfirmationService {
    List<Candidate> getListAttendee() throws CandidateException;


    boolean confirm(String candidateEmail, LocalDate date, Payment transfer, AccommodationChoice singleRoom) throws CandidateException;
    List<Confirmation> getListConfirmations() throws CandidateException;
}
