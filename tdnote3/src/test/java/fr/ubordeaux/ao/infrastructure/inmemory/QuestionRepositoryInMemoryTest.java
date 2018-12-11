package fr.ubordeaux.ao.infrastructure.inmemory;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import fr.ubordeaux.ao.domain.exception.QuestionExamException;
import fr.ubordeaux.ao.domain.model.Question;
import fr.ubordeaux.ao.domain.model.QuestionRepository;
import fr.ubordeaux.ao.infrastructure.inmemory.QuestionRepositoryInMemory;

public class QuestionRepositoryInMemoryTest {

    @Test
    public void shouldNotCreateQuestionnaryIfTooFewQuestion() {
        String question = "Qui a écrit Domain-Driven Design ?";
        String description = "Question de culture générale";
        String reponseA = "Eric Gamma";
        String reponseB = "Eric Evans";
        String reponseC = "Eric EtRamzy";
        List<String> candidate = new ArrayList<String>();
        candidate.add(reponseA);
        candidate.add(reponseB);
        candidate.add(reponseC);
        List<String> trueAnswser = new ArrayList<String>();
        trueAnswser.add(reponseB);
        
        Question q = new Question(question, description, candidate, trueAnswser);

        QuestionRepository repo = new QuestionRepositoryInMemory();
        repo.addQuestion(q);

        try {
            repo.createRandomQuestionnary(4);
            fail("should not create questionnary with too few question ");
        } catch (QuestionExamException ex) {
        }
        
    }

}