package fr.socrates.domain.candidate;

import fr.socrates.domain.CandidateId;

public class Candidate {
    private final CandidateId candidateId;
    private final EMail email;


    public boolean hasEmail(String email) {
        return this.email.equals(EMail.of(email));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Candidate candidate = (Candidate) o;

        return email.equals(candidate.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "email=" + email +
                '}';
    }

    private Candidate(CandidateId candidateId, EMail email) {
        this.candidateId = candidateId;
        this.email = email;
    }


    public static Candidate withEmail(String email) {
        if (email == null) {
            throw new IllegalStateException();
        }
        return new Candidate(new CandidateId(email), EMail.of(email));

    }
}
