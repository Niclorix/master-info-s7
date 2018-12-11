package fr.ubordeaux.ao.domain.model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import fr.ubordeaux.ao.domain.model.Question;
import fr.ubordeaux.ao.domain.model.Questionnary;

public class QuestionnaryTest {

    @Test
    public void shouldComputeScore() {
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
        Question question1 = new Question(question, description, candidate, trueAnswser);

        List<Question> questionList = new ArrayList<Question>();
        questionList.add(question1);

        Questionnary questionnary1 = new Questionnary("#1",questionList);
        questionnary1.answer(question1, reponseA);
        assertEquals(0,questionnary1.getScore());

        Questionnary questionnary2 = new Questionnary("#2",questionList);
        questionnary2.answer(question1, reponseB);
        assertEquals(1,questionnary2.getScore());
        
    }

}