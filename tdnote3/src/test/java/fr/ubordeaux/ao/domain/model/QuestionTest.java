package fr.ubordeaux.ao.domain.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.ubordeaux.ao.domain.exception.QuestionExamException;
import fr.ubordeaux.ao.domain.model.Question;

@SuppressWarnings("unused")
public class QuestionTest {

    @Test
    public void encapsulationShouldBePreserved() {
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
        q.getCandidateAnswerList().clear();
        
        assertEquals(3,q.getCandidateAnswerList().size());
        assertTrue(q.getCandidateAnswerList().contains(reponseB));
    }

    @Test
    public void trueAnswerShouldBelongToCandidateAnswerList() {
        String question = "Qui a écrit Domain-Driven Design ?";
        String description = "Question de culture générale";
        String reponseA = "Eric Gamma";
        String reponseB = "Eric Evans";
        String reponseC = "Eric EtRamzy";
        List<String> candidate = new ArrayList<String>();
        candidate.add(reponseA);
        candidate.add(reponseC);
        List<String> trueAnswser = new ArrayList<String>();
        trueAnswser.add(reponseB);

        try {
            Question q = new Question(question, description, candidate, trueAnswser);
            fail("CandidateAnswer does not contain true answer although it should");
        } catch (QuestionExamException ex) {
        }
    }

}