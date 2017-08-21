package fr.socrates.domain.candidate;

import fr.socrates.infra.repositories.InMemoryCandidateRepository;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CandidateServiceImplTest {
    private CandidateService candidateService;

    @Before
    public void setUp() throws Exception {
        candidateService = new CandidateServiceImpl(new InMemoryCandidateRepository());
    }

    @Test
    public void should_have_no_candidates_at_the_beginning() {
        assertThat(candidateService.getRegisteredCandidates()).isEmpty();
    }

    @Test
    public void should_have_candidate_when_adding_candidate() throws Exception {
        final String email = "test@test.net";
        candidateService.add(Candidate.withEmail(email));
        assertThat(candidateService.getRegisteredCandidates())
                .containsExactly(Candidate.withEmail(email));
    }

    @Test
    public void should_guaranty_unicity_of_candidates() throws Exception {
        final String email = "test@test.net";
        candidateService.add(Candidate.withEmail(email));
        candidateService.add(Candidate.withEmail(email));
        assertThat(candidateService.getRegisteredCandidates())
                .containsExactly(Candidate.withEmail(email));
    }

    @Test
    public void should_find_a_candidate_by_email() throws Exception {
        final String email = "john@doe.fr";
        candidateService.add(Candidate.withEmail(email));
        assertThat(candidateService.findCandidateByEmail(email).isPresent()).isTrue();
    }
}
